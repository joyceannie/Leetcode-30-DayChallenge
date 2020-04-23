/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(0,preorder.length-1, preorder);
    }
    
    public TreeNode build(int start, int end, int[] preorder) {
        if (start>end) {
            return null;
        }
        TreeNode current = new TreeNode(preorder[start]);
        int pos = start + 1;
        while (pos<=end && preorder[pos]<preorder[start]) {
            pos++;
        }
        current.left = build(start+1, pos-1, preorder);
        current.right = build(pos, end, preorder);
        return current;
        
    }
}
