package creational.factory_method_with_builder;

public class Factory {
    private static Factory factory;

    private Factory() {}

    public static creational.factory_method_with_builder.Factory getFactory() {
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
                new StringAndDate.Builder().build();
                break;
            case "ValueAndDate":
                new ValueAndDate.Builder().build();
                break;
            default:
                break;
        }
        return null;
    }
}

