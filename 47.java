public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<Integer>();
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        if(nums==null||nums.length==0)return res;
        boolean[] bl=new boolean[nums.length];
        Arrays.sort(nums);
        helper(nums,res,item,bl,set);
        return res;
    }
    private void helper(int[] nums,List<List<Integer>> res,List<Integer> item,boolean[] bl,HashSet<List<Integer>> set){
        if(item.size()==nums.length){
            if(!set.contains(item)){
                set.add(item);
                res.add(new ArrayList<Integer>(item));
                return;
            }
            else return;
            }
            for(int j=0;j<nums.length;j++){
                if(!bl[j]){
                    item.add(nums[j]);
                    bl[j]=true;
                    helper(nums,res,item,bl,set);
                    item.remove(item.size()-1);
                    bl[j]=false;
                }


        }
    }
}
