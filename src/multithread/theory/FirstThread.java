package multithread.theory;

public class FirstThread extends Thread{
    private String name;
    private TestObject testObject;

    public FirstThread(TestObject testObject) {
        this.testObject = testObject;
        name="";
    }

    public FirstThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread name:"+testObject.increment());

    }

    public static void main(String[] args) {
        TestObject to = new TestObject();
//        FirstThread ft = new FirstThread("ft");
//        FirstThread ft2 = new FirstThread("ft2");
//        FirstThread ft3 = new FirstThread("ft3");
        FirstThread ft = new FirstThread(to);
        FirstThread ft2 = new FirstThread(to);
        FirstThread ft3 = new FirstThread(to);
        ft.start();
        ft2.start();
        ft3.start();
        System.out.println("Main thread");


    }
}

class SecondThread implements Runnable{
    private TestObject testObject;

    public SecondThread(TestObject testObject) {
        this.testObject = testObject;
    }

    @Override
    public void run() {
        System.out.println(testObject.increment());
    }
}

class TestObject{
    int sum;

    public TestObject() {
        sum=0;
    }

    public TestObject(int sum) {
        this.sum = sum;
    }

    public int increment(){
        return ++sum;
    }

    public int decrement(){
        return --sum;
    }
}
