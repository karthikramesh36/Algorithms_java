package java_algos.linked_list;

import org.junit.Test;

//Given a linked list, swap every two adjacent nodes and return its head.
//
//For example,
//Given 1->2->3->4, you should return the list as 2->1->4->3.
//
//Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed

public class swapPairs {

	public void SwapPairsOfLinkedList(Linked_List ll) {
		
		Node current = ll.head;
		ll.head = current.next;
		Node prev = new Node();
		while(current.next != null) {
			
			
			//switching
			Node temp = current.next;
			if(temp.next == null || temp.next.next==null ) {
				//take note of last node for both even and odd cases
				Node last = temp.next;
				temp.next = current;
				current.next = last;
				
				prev.next = temp;
				//prev.next.next = last;
				break;
			}
			
			current.next = current.next.next;
			temp.next = current;
			
			//incrementing
			prev = current;
			current = current.next;
		}
		
		System.out.println(ll.toString());

		
	}
	
	
	
	@Test
	public void test() {
		Linked_List ll = new Linked_List(1);
	//	ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		//ll.add(5);
		//System.out.println(ll.toString());

		swapPairs SP = new swapPairs();
		SP.SwapPairsOfLinkedList(ll);
		
	}
}
