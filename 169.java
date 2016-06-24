//169. Majority Element
//1
public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<3) return nums[0];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>nums.length/2){
                    return nums[i];
                }

            }else{
                map.put(nums[i],1);
            }
        }
       return 0;
    }
}
//2
public class Solution {
    public int majorityElement(int[] nums) {
      int len=nums.length;
      int result=nums[0];
      int count=0;
      for(int i=0; i<len; i++){
          if(count==0 || result==nums[i]){
              result=nums[i];
              count++;
          }
          else count--;
      }
      return result;
    }
}
//3
public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    for (int i = 0; i < n - n / 2; i++) {
        if (nums[i] == nums[i + n / 2]) {
            return nums[i];
        }
    }
    throw new IllegalArgumentException("No Solution");
}
