package creational.builder_interfaces;

import creational.builder_interfaces.interfaces.*;
import creational.builder_interfaces.models.IContainer;
import creational.builder_interfaces.models.ILiquid;
import creational.builder_interfaces.models.ITeaPouch;

public class Tea {
    private IContainer mug;
    private ITeaPouch teaPouch;
    private ILiquid liquid;

    @Override
    public String toString() {
        return "Tea{" +
                "Mug=" + mug +
                ", Teabag=" + teaPouch +
                ", Liquid=" + liquid +
                '}';
    }

    public IContainer getMug() {
        return mug;
    }

    public ILiquid getLiquid() {
        return liquid;
    }

    public ITeaPouch getTeabag() {
        return teaPouch;
    }

    public static RequestContainer builder() {
        return new TeaBuilder();
    }

    public static class TeaBuilder implements RequestContainer, AddContainer, AddLiquid, AddTeaPouch, AddLiquidAfterTeaPouch, AddTeaPouchAfterLiquid, PrepareTea {
        private IContainer teaBuilderMug;
        private ITeaPouch teaBuilderTeaPouch;
        private ILiquid teaBuilderLiquid;

        public TeaBuilder withMugFirst(IContainer mug) {
            this.teaBuilderMug = mug;
            return this;
        }

        @Override
        public TeaBuilder withLiquid(ILiquid liquid) {
            this.teaBuilderLiquid = liquid;
            return this;
        }

        @Override
        public TeaBuilder withTeaPouch(ITeaPouch teaPouch) {
            this.teaBuilderTeaPouch = teaPouch;
            return this;
        }

        @Override
        public TeaBuilder thenWithTeaPouch(ITeaPouch teaPouch) {
            this.teaBuilderTeaPouch = teaPouch;
            return this;
        }

        @Override
        public TeaBuilder thenWithLiquid(ILiquid liquid) {
            this.teaBuilderLiquid = liquid;
            return this;
        }

        @Override
        public TeaBuilder lastStep() {
            return this;
        }

        public Tea makeTea() {
            Tea tea = new Tea();
            tea.mug = this.teaBuilderMug;
            tea.liquid = this.teaBuilderLiquid;
            tea.teaPouch = this.teaBuilderTeaPouch;
            return tea;
        }
    }

    private Tea() {}
}