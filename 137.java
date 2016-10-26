public class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()==1){
                return entry.getKey().intValue();
            }
        }
        return 0;
    }
}

//2
public int singleNumber(int[] A) {
        int [] count = new int[32];
        int result = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < A.length; j++) {
                if (((A[j] >> i) & 1)==1) {
                    count[i]++;
                }
            }
            result |= ((count[i] % 3) << i);
        }
        return result;
    }

//3
public int singleNumber(int[] A) {
         if(A.length == 0||A==null)
            return 0;

        int[] cnt = new int[32];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < 32; j++){
                if( (A[i]>>j & 1) ==1){
                    cnt[j]++;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < 32; i++){
            res += (cnt[i]%3 << i);
          //res |= (cnt[i]%3 << i);
        }
        cnt = null;
        return res;
    }
