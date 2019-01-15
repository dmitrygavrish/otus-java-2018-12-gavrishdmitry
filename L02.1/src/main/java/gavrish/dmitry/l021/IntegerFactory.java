package gavrish.dmitry.l021;

public class IntegerFactory implements ObjectFactory {
    private int createdObjectCount = 0;

    public Object createObject() {
        int object = createdObjectCount;
        createdObjectCount += 1;

        return object;
    }
}
