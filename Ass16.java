
class SharedResource {

    synchronized void display(String name) {
        System.out.println(name + " entered the method.");

        for (int i = 1; i <= 5; i++) {
            System.out.println(name + ": " + i);
        }

        System.out.println(name + " exited the method.");
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String name;

    MyThread(SharedResource resource, String name) {
        this.resource = resource;
        this.name = name;
    }

    public void run() {
        resource.display(name);
    }
}

public class Ass16 {
    public static void main(String[] args) {

        SharedResource obj = new SharedResource();

        MyThread t1 = new MyThread(obj, "Thread 1");
        MyThread t2 = new MyThread(obj, "Thread 2");
        MyThread t3 = new MyThread(obj, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
