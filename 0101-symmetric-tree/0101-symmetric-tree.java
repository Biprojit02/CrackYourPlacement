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
// BFS
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        Queue<TreeNode> leftSubtree =  new LinkedList<>();
        Queue<TreeNode> rightSubtree =  new LinkedList<>();

        leftSubtree.add(root.left);
        rightSubtree.add(root.right);

        while(!leftSubtree.isEmpty() && !rightSubtree.isEmpty()){
            TreeNode left = leftSubtree.poll();
            TreeNode right = rightSubtree.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;

            leftSubtree.add(left.left);
            leftSubtree.add(left.right);
            rightSubtree.add(right.right);
            rightSubtree.add(right.left);
        }
        return true;
    }
}