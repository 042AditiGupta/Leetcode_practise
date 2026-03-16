class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) return -1;
        if(root.left == null && root.right == null) return -1;

        int left_node = root.left.val;
        int right_node = root.right.val;

        if(left_node == root.val) {
            left_node = findSecondMinimumValue(root.left);
        }

        if(right_node == root.val) {
            right_node = findSecondMinimumValue(root.right);
        }

        if(left_node != -1 && right_node != -1) {
            return Math.min(left_node, right_node);
        } 
        else {
            return Math.max(left_node, right_node);
        }
    }
}