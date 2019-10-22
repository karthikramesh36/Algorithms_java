package linked_list;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterNodeInLinkedList {
	
	public int[] NextGreaterNode(Node head) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		while(head !=null) {
			A.add(head.value);
			head = head.next;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		int[] res = new int[A.size()];
		
		for(int i =0; i<A.size(); i++) {
			
			while(!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
				res[stack.pop()] = A.get(i);
			
			stack.push(i);
		}
		
		return res;
	}

}
