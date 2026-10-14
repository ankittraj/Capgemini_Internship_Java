package Day_9;

public class ThreadDemo2 extends Thread{
    public static void main(String[] args) {
        
        Thread t = new Thread("My First Thread");
        t.start();

        String str = t.getName();
        System.out.println(str);
    }
}
