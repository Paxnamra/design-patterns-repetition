package creational.factory_method_with_builder;

import org.joda.time.DateTime;

public class ValueAndDate {
    private final int value;
    private final DateTime time;

    public int getValue() {
        return value;
    }

    public DateTime getTime() {
        return time;
    }

    public static class Builder implements ObjectData {
        private int value;
        private DateTime time;

        public Builder() {
            this.value = 0;
            this.time = DateTime.now();
        }

        public Builder overwriteValue(int value) {
            this.value = value;
            return this;
        }

        public Builder overwriteDateTime(DateTime time) {
            this.time = time;
            return this;
        }

        public ValueAndDate build() {
            return new ValueAndDate(this);
        }

        @Override
        public void informOnCreation() {
            System.out.println("I'm integer: " + value + " and my creation date is: " + time);
        }
    }

    private ValueAndDate(Builder builder) {
        value = builder.value;
        time = builder.time;
        builder.informOnCreation();
    }
}

