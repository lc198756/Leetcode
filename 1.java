public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null) return null;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            /*Integer an=map.get(target-nums[i]);
            if(an==null){
                map.put(nums[i],i);
            }
            else return new int[]{i,an};
        }
        return null;
    **/
    Integer an=map.get(target-nums[i]);
    if(map.containsValue(an)){
        return new int[]{i,an};
    }
    else{
        map.put(nums[i],i);
    }
    }
    return null;
    }
}

/2
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null) return null;
        int[] res=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
    return res;
}}
