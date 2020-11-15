package creational.builder_interfaces.models;

public class Water implements ILiquid {
    private String liquid;

    public Water() {
        this.liquid = "water";
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "liquid='" + liquid + '\'' +
                '}';
    }
}
