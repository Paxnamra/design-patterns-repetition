package creational.builder_interfaces.models;

public class Glass implements IContainer {
    private String colour;

    public Glass() {
        this.colour = "transparent";
    }

    public Glass(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
