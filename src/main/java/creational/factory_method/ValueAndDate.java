package creational.factory_method;

import org.joda.time.DateTime;

public class ValueAndDate implements ObjectData {
    private int value;
    private DateTime time;

    public ValueAndDate() {
        this.value = 0;
        this.time = DateTime.now();
        informOnCreation();
    }

    public ValueAndDate(int value, DateTime time) {
        this.value = value;
        this.time = time;
        informOnCreation();
    }

    public int getValue() {
        return value;
    }

    public DateTime getTime() {
        return time;
    }

    public void setTime(DateTime time) {
        this.time = time;
    }

    @Override
    public void informOnCreation() {
        System.out.println("I'm integer: " + getValue() + " and my creation date is: " + getTime());
    }
}
