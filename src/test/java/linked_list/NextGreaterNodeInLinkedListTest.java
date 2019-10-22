package linked_list;

import org.junit.Test;

public class NextGreaterNodeInLinkedListTest {
	
	@Test
	public void test() {
		
		NextGreaterNodeInLinkedList r = new NextGreaterNodeInLinkedList();
		
		Node head = new Node(2);
		head.next = new Node(7);
		head.next.next = new Node(4);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(5);
		var x = r.NextGreaterNode(head);
	}

}
