package threads;

public class MyThread implements Runnable {
    @Override
    public void run() {
       while (true)  System.out.println("Hi");
    }
}
