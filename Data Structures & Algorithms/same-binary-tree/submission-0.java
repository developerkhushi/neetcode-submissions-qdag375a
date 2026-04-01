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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pQ = new LinkedList<>();
        Queue<TreeNode> qQ = new LinkedList<>();

        pQ.add(p);
        qQ.add(q);

        while (!pQ.isEmpty() && !qQ.isEmpty()) {
            TreeNode temp1 = pQ.poll();
            TreeNode temp2 = qQ.poll();

            if (temp1 == null && temp2 == null) 
                continue;

            if (temp1 == null || temp2 == null) 
                return false;
    
            if (temp1.val != temp2.val) 
                return false;

            pQ.add(temp1.left);
            pQ.add(temp1.right);

            qQ.add(temp2.left);
            qQ.add(temp2.right);
        }
        
        return pQ.isEmpty() && qQ.isEmpty();
    }
}
