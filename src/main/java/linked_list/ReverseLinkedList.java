package linked_list;

import java.util.ArrayList;
import java.util.Stack;

// time complexity - O(n)

public class ReverseLinkedList {
	
	public Node Reverse(Node head) {
		
		
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			
		}
		
		return prev;
	}
	
	
    public int[] nextLargerNodes(Node head) {
        ArrayList<Integer> A = new ArrayList<>();
        for (Node node = head; node != null; node = node.next)
            A.add(node.value);
        int[] res = new int[A.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < A.size(); ++i) {
            while (!stack.isEmpty() && A.get(stack.peek()) < A.get(i))
                res[stack.pop()] = A.get(i);
            stack.push(i);
        }
        return res;
    }

}
