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
    int good;
    public int goodNodes(TreeNode root) {
        good = 0;
        checkGood(root, Integer.MIN_VALUE);
        return good;
    }
    public void checkGood(TreeNode root, int max){
       if(root == null) return;
       if(root.val >= max) good++;
       max = Math.max(max, root.val);
       checkGood(root.left, max);
       checkGood(root.right, max);
    }
}
