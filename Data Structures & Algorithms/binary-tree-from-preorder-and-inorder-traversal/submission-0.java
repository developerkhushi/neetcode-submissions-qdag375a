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

    public TreeNode tree(int[] preorder, int st_pre, int st_in, int end_in) {
        if (st_in > end_in) return null;
        TreeNode root = new TreeNode(preorder[st_pre]);
        int index = inoIndex.get(preorder[st_pre]);
        int leftSize = index - st_in;
        root.left = tree(preorder, st_pre + 1, st_in, index - 1);
        root.right = tree(preorder, st_pre + leftSize + 1, index + 1, end_in);
        return root;
    }
}
