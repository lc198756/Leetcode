public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<Integer>();
        if(nums==null||nums.length==0) return res;
        boolean[] visit=new boolean[nums.length];
        permutation(nums,res,item,visit);
        return res;
    }
    private void permutation(int[] nums,List<List<Integer>> res,List<Integer> item,boolean[] visit){
        if(item.size()==nums.length) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visit[i]){
                item.add(nums[i]);
                visit[i]=true;
                permutation(nums,res,item,visit);
                item.remove(item.size()-1);
                visit[i]=false;
            }
        }
    }
}
