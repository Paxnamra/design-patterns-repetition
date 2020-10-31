package creational.factory_method;

public class Client {
    public static void main(String[] args) {
        Factory objectFactory = Factory.getFactory();

        objectFactory.create("ValueAndDate");
        objectFactory.create("StringAndDate");
        objectFactory.create("");
    }
}
