package heap;

import java.util.Collections;
import java.util.PriorityQueue;

/*Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

For example,
[2,3,4], the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
 

Example:

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2
*/

public class FindMedianFromDataStream {
	
	public PriorityQueue<Integer> right;
	public PriorityQueue<Integer> left;
	
	
	public  FindMedianFromDataStream() {
		right = new PriorityQueue<>();
		left = new PriorityQueue<>( Collections.reverseOrder());
		

	}
	
    public void addNum(int num) {
    	
    	left.add(num);
    	right.add(left.poll());
    	
    	if(right.size() > left.size()) {
    		left.add(right.poll());
    	}

    }
	public double findMedian() {
			
			if(left.size()>right.size())
				return ( double) left.peek();
			else
				return (left.peek() + right.peek()) * 0.5;
		
		
	}

}
