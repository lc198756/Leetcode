public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        Arrays.sort(nums);
        res.add(new ArrayList<Integer>());
        for(int i=1;i<=nums.length;i++){
            helper(res,item,nums,i,0);
        }
        return res;
    }
    private void helper(List<List<Integer>> res,List<Integer> item,int[] nums,int len,int start){
        if(item.size()==len){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i=start;i<nums.length;i++){
            item.add(nums[i]);
            helper(res,item,nums,len,i+1);
            item.remove(item.size()-1);
        }
    }
}
