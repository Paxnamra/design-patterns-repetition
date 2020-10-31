package creational.factory_method;

public class Factory {
    private static Factory factory;

    private Factory() {}

    public static Factory getFactory() {
        if (factory == null) {
            factory = new Factory();
        }
        return factory;
    }

    public ObjectData create(String objectType) {
        return createObject(objectType);
    }

    private ObjectData createObject(String objectType) {

        switch (objectType) {
            case "":
                new EmptyStringVariable();
                break;
            case "StringAndDate":
                new StringAndDate();
                break;
            case "ValueAndDate":
                new ValueAndDate();
                break;
            default:
                break;
        }
        return null;
    }
}

