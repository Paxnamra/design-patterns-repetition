package creational.factory_method_with_builder;

import org.joda.time.DateTime;

public class StringAndDate {
    private String value;
    private DateTime time;

    public String getValue() {
        return value;
    }

    public DateTime getTime() {
        return time;
    }

    public static class Builder implements ObjectData {
        private String value;
        private DateTime time;

        public Builder() {
            this.value = "some-string-value";
            this.time = DateTime.now();
        }

        public Builder overwriteValue(String value) {
            this.value = value;
            return this;
        }

        public Builder overwriteDateTime(DateTime time) {
            this.time = time;
            return this;
        }

        public StringAndDate build() {
            return new StringAndDate(this);
        }

        @Override
        public void informOnCreation() {
            System.out.println("I'm " + value + " and my creation date is: " + time);
        }
    }

    private StringAndDate(Builder builder) {
        value = "some-string-value";
        time = DateTime.now();
        builder.informOnCreation();
    }
}
