public class MovingAverage {
    Deque<Integer> qu;
    double sum;
    int size;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        qu=new ArrayDeque<Integer>();
        this.size=size;
        sum=0;
    }

    public double next(int val) {
        qu.addLast(val);
        sum += val;
        if(qu.size() <= size) return sum/qu.size();
        sum -= qu.removeFirst();
        return sum/qu.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
