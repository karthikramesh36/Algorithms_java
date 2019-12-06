package trees;


/**
 * MaximumPathSumOfBinaryTree
 */
public class MaximumPathSumOfBinaryTree {

    int maxPathSum;
    public int maximumPath(TreeNode root) {
        maxPathSum = Integer.MIN_VALUE;
        maximumPathHelper(root);
        return maxPathSum;
    }

    public int maximumPathHelper(TreeNode root) {
        if(root == null) return 0;

        int left = Math.max(0, maximumPathHelper(root.left));
        int right = Math.max(0, maximumPathHelper(root.right));
        int newPathPrice = root.val + left + right;
        
        maxPathSum = Math.max(maxPathSum, newPathPrice );

        return Math.max(left, right) + root.val;
    }
}