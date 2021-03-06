public class Solution {

    /**
     * explain:http://www.cnblogs.com/Liok3187/p/5016076.html
     */
    public static int nthSuperUglyNumber(int n, int[] primes) {
    int[] dp = new int[n + 1], prime = new int[primes.length];
    int dpIndex = 1, minIndex = -1;
    dp[0] = 1;
    while(dpIndex <= n){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < primes.length; i++){
            int tmp = dp[prime[i]] * primes[i];
            if(tmp < min){
                min = tmp;
                minIndex = i;
            }
        }
        prime[minIndex]++;
        if(min != dp[dpIndex - 1]){
            dp[dpIndex] = min;
            dpIndex++;
        }
    }
    return dp[n - 1];
}
}
