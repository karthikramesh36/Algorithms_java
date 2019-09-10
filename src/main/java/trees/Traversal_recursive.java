package trees;

import java.util.ArrayList;
import java.util.List;

public class Traversal_recursive {
	
	//in order
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root==null) return res;

        DFSinorder(root,res);
        return res;
    }
	
	public void DFSinorder(TreeNode node , List<Integer> l) {
		
		if(node == null)	return;
		
		DFSinorder(node.left, l);
		l.add(node.val);
		DFSinorder(node.right, l);		
	}
	
	//pre order
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root==null) return res;

        DFSpreorder(root,res);
        return res;
    }
	
	public void DFSpreorder(TreeNode node , List<Integer> l) {
		
		if(node == null)	return;
		
		l.add(node.val);		
		DFSpreorder(node.left, l);
		DFSpreorder(node.right, l);		
	}
	
	//post order
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if (root==null) return res;

        DFSpostorder(root,res);
        return res;
    }
	
	public void DFSpostorder(TreeNode node , List<Integer> l) {
		
		if(node == null)	return;
		
		DFSpostorder(node.left, l);
		DFSpostorder(node.right, l);	
		l.add(node.val);
		
	}

}
