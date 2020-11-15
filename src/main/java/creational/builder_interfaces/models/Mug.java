package creational.builder_interfaces.models;

public class Mug implements IContainer {
    private boolean isIcon;

    public Mug() {
        this.isIcon = false;
    }

    public Mug(boolean isIcon) {
        this.isIcon = isIcon;
    }

    public boolean isIcon() {
        return isIcon;
    }

    @Override
    public String toString() {
        return "Mug{" +
                "isIcon=" + isIcon +
                '}';
    }
}
