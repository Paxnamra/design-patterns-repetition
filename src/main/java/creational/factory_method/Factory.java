package creational.factory_method;

public class Factory {
    public void create(String objectType) {
        createObject(objectType);
    }

    private void createObject(String objectType) {

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
    }
}

