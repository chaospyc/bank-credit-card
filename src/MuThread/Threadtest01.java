package MuThread;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 7:56
 */
public class Threadtest01 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunable());
        t.start();
    }
}

class MyRunable implements Runnable{
    @Override
    public void run(){
        System.out.println("Start new Thread");
    }
}
