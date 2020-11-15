package creational.builder_interfaces.models;

public class Soda {
    private boolean sparkling;

    public Soda() {
        this.sparkling = false;
    }

    public Soda(boolean sparkling) {
        this.sparkling = sparkling;
    }

    public boolean isSparkling() {
        return sparkling;
    }

    @Override
    public String toString() {
        return "Soda{" +
                "sparkles=" + sparkling +
                '}';
    }
}