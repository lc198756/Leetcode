public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums==null||nums.length==0)return null;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<Integer>();

        for(int i=1;i<=nums.length;i++){
            helper(res,item,i,0,nums);
        }
        res.add(new ArrayList<Integer>());
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> item,int len,int start,int[] nums){
        if(item.size()==len){
            if(!res.contains(item)){
                res.add(new ArrayList<Integer>(item));
            }
            return;
        }
        for(int i=start;i<nums.length;i++){
            item.add(nums[i]);
            helper(res,item,len,i+1,nums);
            item.remove(item.size()-1);
        }
    }
}
