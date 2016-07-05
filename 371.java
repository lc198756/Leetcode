public class Solution {
    public int getSum(int a, int b) {
        int sum=a^b;
        int carry=a&b;
        int tmp=0;
        while(carry!=0){
            carry=carry<<1;
            tmp=sum;
            sum=carry^sum;
            carry=carry&tmp;
        }
        return sum;
    }
}
