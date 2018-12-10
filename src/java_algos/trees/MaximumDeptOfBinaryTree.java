package java_algos.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MaximumDeptOfBinaryTree {
	
	// RECURSIVE APPROACH
	
	// find the height of a binary tree
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
	/*
	 * 	public int maxDepth(TreeNode root) {
		return maxDepthHelper(root);        
	} 
	
	public int maxDepthHelper(TreeNode node){
		if(node == null) return 0;
		
		int left = maxDepthHelper(node.left);
		int right = maxDepthHelper(node.right);
		
		return Math.max(left , right) + 1;
	}
	 */
	
	//ITERATIVE APPROACH
	//iterative using bfs
	
/*
 * 	public int maxDepth(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root ==null) return 0;
		queue.offer(root);
		int max = 0;
		while(!queue.isEmpty()) {
			int numberOfNodesInLevel = queue.size();
			for(int i = 0; i < numberOfNodesInLevel; i ++) {
				TreeNode node = queue.poll();

				if(node.left != null) queue.offer(node.left);
				if(node.right != null) queue.offer(node.right);
			}
			max +=1;			
		}
		
		return max;
	}
 */
	
	//ITERATIVE APPROACH
	//iterative using dfs
	public int maxDepth(TreeNode root) {
		Stack<TreeNode> st = new Stack<>();
		Stack<Integer> value = new Stack<>();
		
		int max = 0;
		if( root == null )	return max;
		st.push(root);
		value.push(1);
		
		while(!st.isEmpty()) {
			TreeNode node = st.pop();
			int currentHeight = value.pop();
			max = Math.max(max, currentHeight);
			
			if(node.left != null) {
				st.push(node.left);
				value.push(currentHeight +1);
			}
			if(node.right != null) {
				st.push(node.right);
				value.push(currentHeight +1);
			}
		}
		
		return max;
	}

	
	
	
}
