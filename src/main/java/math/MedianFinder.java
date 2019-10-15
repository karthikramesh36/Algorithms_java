package math;

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
 

Follow up:

If all integer numbers from the stream are between 0 and 100, how would you optimize it?
If 99% of all integer numbers from the stream are between 0 and 100, how would you optimize it?


approach 1 : add -> append to list ; median -> sort the current list and return median element
approach 2 : add -> append to a sorted list . insert into list at appropriate position . median -> find middle element 

approach 3 : use balanced bst i.e. avl trees . too complex :P

approach 4 : given below , use min heap and max heap 

add- > add always to left half of array , i.e elements store  in reverse priority queue ( all elements lesser than median )
remove and push to other side ( a normal priority queue storing elements in ascending order i.e right side of median) 

if right side is bigger than left side , then push back to left side . 

thus always maintaining two balanced heaps with properties that left is (n+1) and right side is n , given than the data stream  has 2n + 1 elements in odd case 

 */



public class MedianFinder {
    PriorityQueue<Integer> left; 
    PriorityQueue<Integer> right;
    /** initialize your data structure here. */
    public MedianFinder() {
        left = new PriorityQueue<>((a,b) -> b-a);
        right = new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        
        left.add(num);
        
        right.add(left.poll());
        
        if(left.size() < right.size()){
            left.add(right.poll());
        }
        
    }
    
    public double findMedian() {
        double median;
        if(left.size() > right.size()){
            median = (double)left.peek();
        }
        else{
            median = (left.peek() + right.peek()) * 0.5 ;
        }
        
        return median;
    }
}
