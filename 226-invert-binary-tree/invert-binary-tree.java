/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
       return invertusingThirdVariable(root); 
    }
    public TreeNode invertusingThirdVariable(TreeNode root)
    {
        if(root==null)return null;
        TreeNode a=root.left;
        root.left=root.right;
        root.right=a;
        invertusingThirdVariable(root.left);
        invertusingThirdVariable(root.right);
        return root;
    }
}