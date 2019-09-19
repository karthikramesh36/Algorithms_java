package linked_list;

import org.junit.Test;

public class Linked_List {
	Node head;
	
	//creating empty constructor sets the head of linked list to 0
	Linked_List(){
		this.head = new Node();
	}

	Linked_List(Object value){
		this.head = new Node(value);
	}
	
	public void add(Object node) {
		Node current = head;
		if(current.next == null) {
			current.next = new Node(node);
			return;
		}
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = new Node(node);
	}
	
	public void push(Object node) {
	
		Node current = new Node(node);
		current.next = head;
		head = current;
	}
	
	public String toString() {
		Node current = head;
		String result = "";
		while(current.next != null) {
			result += current.value + "->";
			//System.out.print(current.value + "->");
			current = current.next;
		}
		result += current.value;
		return result;
	}
	
	
	@Test
	public void testlinked_list() {
		Linked_List ll = new Linked_List(1);
	//	ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll.toString());
		
		
	}
}
