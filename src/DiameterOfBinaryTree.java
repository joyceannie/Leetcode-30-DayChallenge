/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class MetaData {
    int depth;
    int diameter;
    
    MetaData() {
        this.depth = 0;
        this.diameter = 0;
    }
}
class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) {
            return 0;
        }
        return helper(root).diameter;
    }
    
    public MetaData helper(TreeNode root) {
        MetaData result = new MetaData();
        if (root.left==null && root.right==null) {
            return result;
        } else if (root.left==null) {
            MetaData right = helper(root.right); 
            result.depth = right.depth+ 1;
            result.diameter = right.depth +1;
            result.diameter = Math.max(result.diameter, right.diameter);            
        } else if(root.right==null) {
            MetaData left = helper(root.left);
            result.depth = left.depth + 1;
            result.diameter = left.depth + 1;
            result.diameter = Math.max(result.diameter,left.diameter);           
        } else {
            MetaData left = helper(root.left);
            MetaData right = helper(root.right); 
            result.depth = Math.max(left.depth, right.depth) + 1;
            result.diameter = left.depth + 1 + right.depth +1;
            result.diameter = Math.max(result.diameter, Math.max(left.diameter, right.diameter));
            
        }
        return result;
        //visit
        
        
    }
}
