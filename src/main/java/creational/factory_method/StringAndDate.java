package creational.factory_method;

import org.joda.time.DateTime;

public class StringAndDate implements ObjectData {
    private String value;
    private DateTime time;

    public StringAndDate() {
        this.value = "some-string-value";
        this.time = DateTime.now();
        informOnCreation();
    }

    public StringAndDate(String value, DateTime time) {
        this.value = value;
        this.time = time;
        informOnCreation();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DateTime getTime() {
        return time;
    }

    public void setTime(DateTime time) {
        this.time = time;
    }

    @Override
    public void informOnCreation() {
        System.out.println("I'm " + getValue() + " and my creation date is: " + getTime());
    }
}
