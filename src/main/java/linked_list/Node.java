package linked_list;

public class Node {
	int value ;
	Node next ;
	
	Node(Object value){
		this.value = (int) (value);
		this.next = null;
	}
	
	Node(){
		this.next = null;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
}
