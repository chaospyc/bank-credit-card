package 多线程;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/24 7:56
 */
public class Threadtest01 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}


class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("start new thread");
    }
}
