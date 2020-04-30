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
class CheckValidStringInBinaryTree {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        if (root==null) {
            return false;
        }
        return dfs(root, arr, 0, arr.length);
    }
    
    public boolean dfs(TreeNode root, int[] arr, int pos, int len) {
        if (pos==len-1) {
            return root.val==arr[pos] && root.left==null && root.right==null;
        }
        boolean left = false;
        boolean right = false;
        if (root.val==arr[pos]) {
            if (root.left!=null) {
                left = dfs(root.left, arr, pos+1, len);   
            }
            if (root.right!=null) {
                right = dfs(root.right,arr, pos+1, len);
            }
            return left || right;
        } 
        return false;
        
        
    }
}
