public class Solution {
    public int divide(int dividend, int divisor) {
        return (int)res(dividend,divisor);
    }
    private static long res(long dividend,long divisor){
        if(divisor==1) return dividend;
        if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        if(divisor<0) return -res(dividend,-divisor);
        if(dividend<0) return -res(-dividend,divisor);
        if(divisor==0) return Integer.MAX_VALUE;
        if(divisor>dividend) return 0;
        if(dividend==0)return 0;
        if(dividend==divisor) return 1;
        long d=divisor;
        int count=1;
        int ans=0;
        while(d<dividend){
            d<<=1;
            count<<=1;

        }
        while(d>=divisor){
            while(dividend >= d){
                dividend-=d;
                ans+=count;
            }
            d>>=1;
            count>>=1;
        }
        return ans;
    }
}
