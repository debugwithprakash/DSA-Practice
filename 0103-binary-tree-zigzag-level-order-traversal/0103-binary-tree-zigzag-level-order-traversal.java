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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        
        while(!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> row = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode frontNode = q.remove();
                row.add(frontNode.val);
                if(frontNode.left!=null) q.add(frontNode.left);
                if(frontNode.right!=null) q.add(frontNode.right);
            }
            
            if(flag == false) {
                ans.add(row);
                flag = true;
            }
            else {
                Collections.reverse(row);
                ans.add(row);
                flag = false;
            }
        }
        return ans;
    }
}