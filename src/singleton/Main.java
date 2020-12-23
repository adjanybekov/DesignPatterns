package singleton;

import singleton.SingleObject;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        SingleObject so = SingleObject.getInstance();
        so.speak();
    }
}
