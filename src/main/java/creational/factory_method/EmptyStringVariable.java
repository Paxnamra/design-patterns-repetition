package creational.factory_method;

public class EmptyStringVariable implements ObjectData {
    public EmptyStringVariable() {
        informOnCreation();
    }

    @Override
    public void informOnCreation() {
        System.out.println("This object is an empty String");
    }
}
