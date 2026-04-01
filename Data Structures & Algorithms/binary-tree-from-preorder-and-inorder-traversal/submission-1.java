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

    public Map<Integer, Integer> inoIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inoIndex = new HashMap<>();
        
        for (int i = 0; i < inorder.length; i++) {
            inoIndex.put(inorder[i], i);
        }

        return tree(preorder, 0, 0, inorder.length - 1);
    }

    public TreeNode tree(int[] preorder, int preStart, int inStart, int inEnd) {
        if (inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = inoIndex.get(preorder[preStart]);
        int leftSize = index - inStart;
        root.left = tree(preorder, preStart + 1, inStart, index - 1);
        root.right = tree(preorder, preStart + leftSize + 1, index + 1, inEnd);
        return root;
    }
}
