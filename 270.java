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
   public int closestValue(TreeNode root, double target) {
            int nextClosest = root.val;
            // get the current difference
            double currentDiff = Math.abs(target - (double) root.val);
            // if target is bigger than the root value then its possible that difference could be decreased while moving to the right subtree hence traverse right

            if(target > root.val && root.right != null)
                nextClosest = closestValue(root.right, target);
           // if target is lesser than the root value then its possible that difference could be decreased while moving to the left subtree hence traverse left
            if(target < root.val && root.left != null)
                nextClosest = closestValue(root.left, target);
            // get the closest value from child node
            double nextDiff = Math.abs(target - (double) nextClosest);
           // return child value if difference is smaller.
            if(nextDiff < currentDiff)
                return nextClosest;
          //return root value as default.
           return root.val;
        }
}
