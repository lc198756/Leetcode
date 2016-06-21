//104. Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int max=1;
        return dfs(root,max);
    }
    int dfs(TreeNode root, int max){
        if(root.left==null&&root.right==null)return max;
        if(root.left==null&&root.right !=null)return dfs(root.right,max+1);
        if(root.left !=null&&root.right==null)return dfs(root.left,max+1);
        return Math.max(dfs(root.left,max+1),dfs(root.right,max+1));
    }
}
