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
    public boolean isSameTree(TreeNode A, TreeNode B) {

        if (A == null && B == null) return true;
        if (A == null || B == null) return false;

        return A.val == B.val && isSameTree(A.left, B.left) 
                && isSameTree(A.right, B.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (isSameTree(root, subRoot)) return true;
        
        return isSubtree(root.left, subRoot) 
            || isSubtree(root.right, subRoot);
    }
}
