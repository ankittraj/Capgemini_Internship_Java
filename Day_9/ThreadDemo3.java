package Day_9;

public class ThreadDemo3 implements Runnable{
    public void run(){
        System.out.println("This thread is running");
    }
    public static void main(String[] args) {
        ThreadDemo3 obj = new ThreadDemo3();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
