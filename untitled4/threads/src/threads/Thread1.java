package threads;

public class Thread1 extends  Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Hello");
        }
    }
}
