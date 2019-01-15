package gavrish.dmitry.l021;

public class MemoryMeter {
    public static int measure(ObjectFactory factory) throws InterruptedException {
        int size = 2_000_000;
        Object[] array = new Object[size];
        long initialMemory = getMemory();

        for (int i = 0; i < array.length; i++) {
            array[i] = factory.createObject();
        }

        long afterAllocMemory = getMemory();
        int elementSize = (int) (afterAllocMemory - initialMemory) / array.length;
        array = null;

        Thread.sleep(1000);

        return elementSize;
    }

    private static long getMemory() throws InterruptedException {
        System.gc();
        Thread.sleep(10);
        Runtime runtime = Runtime.getRuntime();

        return runtime.totalMemory() - runtime.freeMemory();
    }
}
