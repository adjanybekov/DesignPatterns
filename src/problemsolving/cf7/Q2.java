package problemsolving.cf7;

import java.util.LinkedList;
import java.util.List;

public class Q2 {
    static final List<Object[]> arrays = new LinkedList<>();

    public static void grabAllMemory() {
        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }

    public static void main(String[] args) {
        grabAllMemory();
    }
}
