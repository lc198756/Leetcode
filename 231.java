//231. Power of Two
//1
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)return false;
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return n==1;
    }
}
//2
public class Solution {
    public boolean isPowerOfTwo(int n) {

       return (Math.log10(n) / Math.log10(2)) % 1 == 0;
    }
}
