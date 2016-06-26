public class Solution {
    public boolean isHappy(int n) {
        if(n==1||n==7)return true;
        if(n<10)return false;
        int d=0;

        while(n>0){
            d+=(n%10)*(n%10);
            n/=10;
        }
        return isHappy(d);
    }
}
//2
public class Solution {
    private int getNextHappy(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
    HashSet<Integer> hash=new HashSet<Integer>();
    while (n !=1){
        if (hash.contains(n)){
            return false;
        }
        hash.add(n);
        n=getNextHappy(n);
    }
    return true;
    }
}
