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
    List<String> res = new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root!=null) xiamian(root,String.valueOf(root.val));
        return res;
    }
    private void xiamian(TreeNode root,String path){
        if(root.left==null&&root.right==null) res.add(path);
        if(root.left!=null) xiamian(root.left,path+"->"+root.left.val);
        if(root.right!=null) xiamian(root.right,path+"->"+root.right.val);

    }
}
