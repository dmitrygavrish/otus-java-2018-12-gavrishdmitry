package gavrish.dmitry.l021;

public class StringFactory implements ObjectFactory {
    private final boolean createsEmptyString;
    private int counter = 0;

    public StringFactory(boolean createsEmptyString) {
        this.createsEmptyString = createsEmptyString;
    }

    public Object createObject() {
        if (createsEmptyString) {
            return new String("");
        }

        int startStringValue = 100_000;
        int endStringValue = 999_999;
        int value = startStringValue + counter;

        if (value > endStringValue) {
            counter = 0;
            value = startStringValue;
        }

        String object = new String(String.valueOf(value));
        counter += 1;

        return object;
    }
}
