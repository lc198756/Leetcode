public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<>();
        if(target<0)return res;
        if(candidates==null||candidates.length==0)return res;
        Arrays.sort(candidates);
        helper(candidates,item,0,target,res);
        return res;
    }
    private void helper(int[] candidates,List<Integer> item,int i,int target,List<List<Integer>> res){
        if(target==0) {
            res.add(new ArrayList<Integer>(item));
            return;
        }
        if(target<0)return;
        for(int j=i;j<candidates.length;j++){
            //deal with dupicate
            if(j>0 && candidates[j] == candidates[j-1]) continue;
            item.add(candidates[j]);
            helper(candidates,item,j,target-candidates[j],res);
            item.remove(item.size()-1);
        }

    }
}
