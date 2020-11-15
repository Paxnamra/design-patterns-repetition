package creational.builder_interfaces.interfaces;

import creational.builder_interfaces.models.ILiquid;

public interface AddTeaPouch {
    AddLiquidAfterTeaPouch thenWithLiquid(ILiquid liquid);
}
