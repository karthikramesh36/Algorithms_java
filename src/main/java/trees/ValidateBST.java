package trees;

import java.util.Stack;

public class ValidateBST {
	
	public Boolean IsValidBST(TreeNode root) {
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		TreeNode pre = null;
		while(!stack.isEmpty() || root != null) {
			
			while(root != null) {
				stack.push(root.left);
				root = root.left;
			}
			
			root = stack.pop();
			
			if( pre != null && pre.val > root.val)
				return false;
			
			pre = root;
			root = root.right;
		}
		
		return true;
	}

}
