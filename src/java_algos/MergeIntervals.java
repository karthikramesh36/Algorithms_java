package java_algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;


public class MergeIntervals {
	
	  public class Interval {
	      int start;
	      int end;
	      Interval() { start = 0; end = 0; }
	      Interval(int s, int e) { start = s; end = e; }
	      
	      public String toString() {
	    	  return "[" + start + "," + end + "]";
	    	  
	      }
	  }
	  
	  public class intervalComparator implements Comparator<Interval>{

		@Override
		public int compare(Interval arg0, Interval arg1) {
			return arg0.start - arg1.start;
			// TODO Auto-generated method stub
		}
		  
	  }
	 
	
    public List<Interval> merge(List<Interval> intervals) {

		Collections.sort(intervals, new intervalComparator ());
		LinkedList<Interval> merged = new LinkedList<Interval>();
		
		for ( Interval interval : intervals) {
			if(merged.isEmpty() || merged.getLast().end < interval.start) {
    			merged.add(interval);

			}
			if(merged.getLast().end > interval.start) {
				merged.getLast().end = Math.max(merged.getLast().end, interval.end);
			
			}
		}
		return merged;
    }
    
    @Test
    public void testMergeIntervals() {
    	MergeIntervals mi = new MergeIntervals();
    	List<Interval> intervals = new ArrayList<Interval>();
    	intervals.add(new Interval(1,3));
    	intervals.add(new Interval(2,7));
    	intervals.add(new Interval(4,6));
    	intervals.add(new Interval(5,3));
    	intervals.add(new Interval(9,11));
    	intervals.add(new Interval(12,14));
    	
    	mi.merge(intervals).stream().forEach(System.out::println);
    	
    }
}

