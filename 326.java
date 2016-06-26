//1
public class Solution {

    public boolean isPowerOfThree(int n) {
       int num=n;
        while(num>0 && num%3==0)
            num/=3;
        return num==1;
    }
}
//2
public class Solution {
    public boolean isPowerOfThree(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }
}
