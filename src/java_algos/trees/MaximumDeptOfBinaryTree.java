package java_algos.trees;

public class MaximumDeptOfBinaryTree {
		//top down approach
	/*
	private int answer = 0;
	public int maxDepth(TreeNode root) {
		maxDepth(root,1);        
		return answer;
	}
	
	public void maxDepth(TreeNode node, int depth) {
	    if(node == null) return;
		if(node.left == null && node.right == null)
			answer = Math.max(answer, depth);
		maxDepth(node.left, depth +1);
		maxDepth(node.right, depth +1);
		
			
	}
	*/

	
	//bottom down approach
	public int maxDepth(TreeNode root) {
		return maxDepthHelper(root);        
	} 
	
	public int maxDepthHelper(TreeNode node){
		if(node == null) return 0;
		
		int left = maxDepthHelper(node.left);
		int right = maxDepthHelper(node.right);
		
		return Math.max(left , right) + 1;
	}  
	
}
