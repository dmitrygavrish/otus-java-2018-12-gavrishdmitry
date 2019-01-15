package gavrish.dmitry.l021;

import java.util.ArrayList;

public class StringListFactory implements ObjectFactory {
    private final boolean createsEmptyList;

    public StringListFactory(boolean createsEmptyList) {
        this.createsEmptyList = createsEmptyList;
    }

    public Object createObject() {
        ArrayList list = new ArrayList();

        if (createsEmptyList) {
            return list;
        }

        int listSize = 12;

        for (int i = 0; i < listSize; i++) {
            list.add(new String(""));
        }

        return list;
    }
}
