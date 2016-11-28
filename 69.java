public class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x<0)return -1;
        int l=1;
        int r=x/2+1;
        while(r>=l){
            int m=l+(r-l)/2;
            if(m<=x/m&& (m+1)>x/(m+1))return m;
            else if(m>x/m)r=m-1;
            else l=m+1;
        }
        return 0;
    }
}
