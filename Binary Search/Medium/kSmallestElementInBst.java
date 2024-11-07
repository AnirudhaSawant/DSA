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

    int cnt = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }

    public void helper(TreeNode root, int k) {
        if(root.left != null) {
            helper(root.left,k);
        }

        cnt++;
        if(cnt == k) {
            ans = root.val;
        }

        if(root.right != null) {
            helper(root.right,k);
        }
    }
}