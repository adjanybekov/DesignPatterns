package singleton;

public class SingleObject {
    private static SingleObject singleObject;//= new singleton.SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        if (singleObject == null) {
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    public static void speak() {
        System.out.println("Hola Madrid!");
    }
}
