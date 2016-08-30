/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(root==null)return res;
        while(root!=null){
        List<Integer> leaves=new ArrayList<Integer>();
        root=getLv(root,leaves);
        res.add(leaves);
        }
        return res;

    }
    private TreeNode getLv(TreeNode root, List<Integer> res){
        if(root==null) return null;
        //将root.val加进list，把root设置成null
        if(root.left==null&&root.right==null){
            res.add(root.val);
            return null;
        }
        root.left=getLv(root.left,res);
        root.right=getLv(root.right,res);
        return root;

    }

}
