package creational.builder_interfaces.models;

public class Herbs implements ITeaPouch {
    private String herbsType;

    public Herbs() {
        herbsType = "cheapest";
    }

    public Herbs(String herbsType) {
        this.herbsType = herbsType;
    }

    public String getHerbsType() {
        return herbsType;
    }

    @Override
    public String toString() {
        return "Herbs{" +
                "herbsType='" + herbsType + '\'' +
                '}';
    }
}
