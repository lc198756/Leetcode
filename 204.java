public class Solution {
    public int countPrimes(int n) {
        boolean[] pri=new boolean[n];
        Arrays.fill(pri,true);
        for(int i=2;i<n;i++){
            if(pri[i]==true){
                for(int j=2*i;j<n;j=j+i){
                    pri[j]=false;
                }
            }
        }
        int res=0;
        for(int i=2;i<n;i++){
            if (pri[i]==true)
            res++;
        }
        return res;
    }
}
