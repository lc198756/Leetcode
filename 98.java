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
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    private boolean helper(TreeNode node,Integer low,Integer high){
        if(node==null)return true;
        return (low == null || node.val > low) && (high == null || node.val < high) && helper(node.left, low, node.val) && helper(node.right,node.val, high);
    }
}
