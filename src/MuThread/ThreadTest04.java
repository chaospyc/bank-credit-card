package MuThread;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 8:34
 */
public class ThreadTest04 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.interrupt();
        t.join();
        System.out.println("end");
    }
}
class MyThread extends Thread {
    public void run() {
        Thread hello = new HelloThread();
        hello.start();
        try {
            hello.join(); // 等待hello线程结束
        } catch (InterruptedException e) {
            System.out.println("interrupted!");
        }
        hello.interrupt();
    }
}

class HelloThread extends Thread{

    public void run(){
        int n = 0;
        while(! isInterrupted()){
            n ++;
            System.out.println(n + " hello !");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                break;
            }

        }
    }
}


