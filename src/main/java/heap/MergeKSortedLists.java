package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

import linked_list.Node;

/*Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6


approach : use multiple pointers and add the smallest element while iterating and increase pointer for the array from which element was added. 

finding the smallest element logic can be replaced by making use of a priority queue
*/
public class MergeKSortedLists {
	
	
    public Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>( new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				return (o1.value - o2.value); 
			}
        });
        
    	for(Node n : lists)
    		pq.add(n);
    	
    	Node head = new Node(0);
    	Node cur = head;
    	while(!pq.isEmpty()) {
    		
    		Node temp = pq.poll();
    		cur.next = temp;
    		
    		Node next = temp.next;
    		cur = cur.next;
    		
    		if(next != null)
    			pq.add(next);
    		
    	}
    	
    	return head.next;
    }

}
