package java_algos.arrays;

import java.util.ArrayList;

public class MergeTwoSortedLists {
	
	public static ArrayList<Integer> Merge(ArrayList<Integer> left, ArrayList<Integer> right ) {
		ArrayList<Integer> sorted = new ArrayList<Integer>();

         while (left.size() > 0 && right.size()> 0)
         {
             if (left.size()> 0 && right.size()> 0)
             {
                 if (left.get(0) < right.get(0))
                 {
                     sorted.add(left.get(0));
                     left.remove(0);
                 }
                 else
                 {
                	 sorted.add(right.get(0));
                     right.remove(0);
                 }
             }

             else if (left.size() > 0)
             {
                 sorted.add(left.get(0));
                 left.remove(0);
             }
             else if (right.size() > 0)
             {
                 sorted.add(right.get(0));
                 right.remove(0);
             }

         }

         return sorted;		
	}

}
