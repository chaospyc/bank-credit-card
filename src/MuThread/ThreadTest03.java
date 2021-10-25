package MuThread;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 8:27
 */
public class ThreadTest03 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(()->{

            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Start");
        t.start();
//        t.join();
        System.out.println("end");

    }
}
