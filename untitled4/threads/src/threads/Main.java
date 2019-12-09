package threads;

public class Main {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread(new MyThread()).start();
        while (true){
            System.out.println("main");
        }
    }
}
