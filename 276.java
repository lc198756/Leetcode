//1

public class Solution {
    public int numWays(int n, int k) {
        // 当n=0时返回0
        int dp[] = {0, k , k*k, 0};
        if(n <= 2){
            return dp[n];
        }
        for(int i = 2; i < n; i++){
            // 递推式：第三根柱子要么根第一个柱子不是一个颜色，要么跟第二根柱子不是一个颜色
            dp[3] = (k - 1) * (dp[1] + dp[2]);
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
}
//2
public class Solution {
    public int numWays(int n, int k) {
    if(n < 1)   return 0;
    int sum1 = k, sum2 = 0;
    while(--n > 0){
        int temp = sum2;
        sum2 = sum1;
        sum1 = (sum1 + temp) * (k - 1);
    }
    return sum1 + sum2;
}
}
