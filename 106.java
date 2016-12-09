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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    private TreeNode helper(int[] in,int is,int ie,int[] post,int ps,int pe){
        if(is>ie||ps>pe)return null;
        int rootValue=post[pe];
        int rootIndex=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==rootValue){
                rootIndex=i;
                break;
            }
        }
        int len=rootIndex-is;
        TreeNode root=new TreeNode(rootValue);
        root.left=helper(in,is,rootIndex-1,post,ps,ps+len-1);
        root.right=helper(in,rootIndex+1,ie,post,ps+len,pe-1);
        return root;
    }
}
