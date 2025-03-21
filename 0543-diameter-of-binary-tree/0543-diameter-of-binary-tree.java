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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter[] = new int[1];
        maxDiameter(root, diameter);
        return diameter[0];
    }
    public int maxDiameter(TreeNode root, int[] diameter){
        if(root == null) return 0;

        int leftMax = maxDiameter(root.left, diameter);
        int rightMax = maxDiameter(root.right, diameter);

        diameter[0] = Math.max(diameter[0], leftMax + rightMax);
        return Math.max(leftMax, rightMax) + 1;
    }
}