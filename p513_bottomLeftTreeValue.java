/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        
        int val = root.val;
        TreeNode cur = root;
        
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(cur);
        
        while (!nodes.isEmpty()) {
            cur = nodes.poll();
            val = cur.val;

            if (cur.right != null) {
                nodes.add(cur.right);
            }
            
            if (cur.left != null) {
                nodes.add(cur.left);
            } 
        }
        
        return val;
    }
}
