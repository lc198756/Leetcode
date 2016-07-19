/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 * base case: no list in the list res=depth*integer
 */

public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
       if(nestedList==null||nestedList.size()==0) return 0;
       int [] res={0};
       for(NestedInteger w:nestedList){
           dfs(w,1,res);
       }
       return res[0];
    }
    private void dfs(NestedInteger nestInt,int depth,int[] res){
        if(nestInt.isInteger()==true){
            res[0]+=depth*nestInt.getInteger();
            return;
        }
        for(NestedInteger w:nestInt.getList()){
            dfs(w,depth+1,res);
        }
    }
}
