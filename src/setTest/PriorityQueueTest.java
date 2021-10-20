package setTest;

import java.util.Comparator;
import java.util.Queue;
import java.util.PriorityQueue;
/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/21 6:32
 */
public class PriorityQueueTest {
    //PriorityQueue和Queue的区别在于，它的出队顺序与元素的优先级有关，
    // 对PriorityQueue调用remove()或poll()方法，返回的总是优先级最高的元素。
    public static void main(String[] args) {
        Queue<BankUser> q = new PriorityQueue<>(new UserCompartor());
        q.offer(new BankUser("Bob","A1"));
        q.offer(new BankUser("Chaos","V1"));
        q.offer(new BankUser("Boss","A3"));

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());

    }
}

class UserCompartor implements Comparator<BankUser>{
    public  int compare(BankUser u1,BankUser u2){
        if(u1.number.charAt(0) == u2.number.charAt(0)){
            return u1.number.compareTo(u2.number);
        }
        if(u1.number.charAt(0) == 'V'){
            return -1;
        }else{
            return 1;
        }
    }
}

class BankUser{
    public final String name;
    public final String number;

    public BankUser(String name,String number){
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return name + " /" + number;
    }

}