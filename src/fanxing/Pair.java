package fanxing;

/**
 * @author chaos
 * @version 1.0
 * @date 2021/10/13 16:56
 */
class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(T last) {
        this.last = last;
    }
}

class IntPair extends Pair<Integer> {
    public IntPair(Integer first,Integer last){
        super(first,last);
    }
}