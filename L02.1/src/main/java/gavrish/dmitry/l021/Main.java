package gavrish.dmitry.l021;

public class Main {
    public static void main(String[] args) {
        try {
            int intSize = MemoryMeter.measure(new IntegerFactory());
            int emptyStringSize = MemoryMeter.measure(new StringFactory(true));
            int stringSize = MemoryMeter.measure(new StringFactory(false));
            int emptyListSize = MemoryMeter.measure(new StringListFactory(true));
            int listSize = MemoryMeter.measure(new StringListFactory(false));

            System.out.println("Integer size: " + intSize);
            System.out.println("Empty string size: " + emptyStringSize);
            System.out.println("String size: " + stringSize);
            System.out.println("Empty list size: " + emptyListSize);
            System.out.println("List of 12 empty strings size: " + listSize +
                    "; [total size] - [empty strings' size] = " + (listSize - 12 * emptyStringSize));
        } catch (InterruptedException err) {
            System.out.println("Measurement failed due to exception");
        }
    }

}
