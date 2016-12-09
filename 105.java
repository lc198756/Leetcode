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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode helper(int[] pre,int ps,int pe,int[] in,int is,int ie){
        if(ps>pe||is>ie)return null;
        int rootVal=pre[ps];
        int rootIndex=0;
        for(int i=0;i<in.length;i++){
            if(in[i]==rootVal){
                rootIndex=i;
                break;
            }
        }
        int len=rootIndex-is;
        TreeNode root=new TreeNode(rootVal);
        root.left=helper(pre,ps+1,ps+len,in,is,rootIndex-1);
        root.right=helper(pre,ps+len+1,pe,in,rootIndex+1,ie);
        return root;
    }
}
