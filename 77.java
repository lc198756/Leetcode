public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> item=new ArrayList<>();
        if(n<=0||n<k)return res;
        dfs(res,item,n,k,1);
        return res;
    }
    private void dfs(List<List<Integer>> res,List<Integer> item,int n,int k,int i){
        if(item.size()==k){
            res.add(new ArrayList<Integer>(item));
            return;
        }
        for(int j=i;j<=n;j++){
            item.add(j);
            dfs(res,item,n,k,j+1);
            item.remove(item.size()-1);
        }
    }
}
