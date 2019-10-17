package linked_list;

public class Node {
	public int value ;
	public Node next ;
	
	public Node(Object value){
		this.value = (int) (value);
		this.next = null;
	}
	
	public Node(){
		this.next = null;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
}
