package java_algos.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	// use breadth first search to explore all nodes under each level
	// queue contains only nodes in each level , starting from root , where queue size is 1
	// set size of queue as upper limit and loop to explore all child nodes of current node
	//add child nodes of current node to queue and finally remove current node from queue
	// add current level nodes to a list
	// reset size of queue as upper limit and current level list to all levels list 
	// continue until queue is empty
	
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        
    		Queue<TreeNode> queue = new LinkedList<>();
    		List<List<Integer>> result = new LinkedList<List<Integer>>();
    		
    		if(root == null)	return result;
    		queue.offer(root);
    		while(!queue.isEmpty()) {
    			int nodesInCurrentLevel = queue.size();
    			List<Integer> levelList = new ArrayList<Integer>();
    			for(int i =0; i < nodesInCurrentLevel; i++) {
    				TreeNode node = queue.poll();
    				if(node.left != null) queue.offer(node.left);
    				if(node.right != null) queue.offer(node.right);
    				levelList.add(node.val);  				
    			}
    			result.add(levelList);
    		}
    		
    		return result;
    	
    }
	
}
