package java_algos.linked_list;

import java.util.HashSet;

public class DetectLoop {
	
	static boolean detectLoop(Linked_List h) 
    { 
		Node head = h.head;
        HashSet<Node> s = new HashSet<Node>(); 
        while (head != null) 
        { 
             // If we have already has this node in hash set it means their is a cycle 

            if (s.contains(head)) 
                return true; 
    
            // If we are seeing the node for the first time, insert it in hash 
            s.add(head); 
    
            head = head.next; 
        } 
    
        return false; 
    } 

}
