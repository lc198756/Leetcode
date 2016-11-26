public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<>();
        HashSet<List<Integer>> set=new HashSet<>();
        if(target<0)return res;
        if(candidates==null||candidates.length==0)return res;
        Arrays.sort(candidates);
        helper(candidates,item,0,target,res,set);
        return res;
    }
    private void helper(int[] candidates,List<Integer> item,int i,int target,List<List<Integer>> res,HashSet<List<Integer>> set){
        if(target==0) {
            if(!set.contains(item)){
            res.add(new ArrayList<Integer>(item));
            set.add(item);
            return;
            }
            else return;
        }
        if(target<0)return;
        for(int j=i;j<candidates.length;j++){
            //deal with dupicate
           // if(j>0 && candidates[j] == candidates[j-1]) continue;
            item.add(candidates[j]);
            helper(candidates,item,j+1,target-candidates[j],res,set);
            item.remove(item.size()-1);
        }
    }
}
