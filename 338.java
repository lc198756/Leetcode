/*int[] a=new int[n];
for(i=0;i<n)
int x=i;
while(x!=0)
if(x%2=0) x=x/2
else x=x/2; a[i]++;
**/
public class Solution {
    public int[] countBits(int num) {
        int[] res=new int[num+1];
        for(int i=0;i<=num;i++){
            int x=i;
            while(x!=0){
                if(x%2==0){
                    x=x/2;
                }
                else{
                    x=x/2;
                    res[i]++;
                }
            }
        }
        return res;
    }
}
//2
public int[] countBits(int num) {
    int[] results = new int[num + 1];
    for(int i = 0; i <= num; i++){
        results[i] = numOfOne(i);
    }
    return results;
}

private int numOfOne(int i){
    int count = 0;
    while(i > 0){
        i = i & (i - 1);
        count++;
    }
    return count;
}
