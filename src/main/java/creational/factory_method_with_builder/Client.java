package creational.factory_method_with_builder;

public class Client {
    public static void main(String[] args) {
        creational.factory_method_with_builder.Factory objectFactory = Factory.getFactory();

        objectFactory.create("ValueAndDate");
        objectFactory.create("StringAndDate");
        objectFactory.create("");
    }
}

