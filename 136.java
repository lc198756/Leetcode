public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else map.put(nums[i],1);
        }
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res=nums[i];
            }
        }
        return res;
    }
}
//2
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++){
        result = result ^ nums[i];
        }
        return result;
}
}
