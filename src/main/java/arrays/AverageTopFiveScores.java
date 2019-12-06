package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;


//imcomplete - attempted logic is correct , but need to rewrite 

public class AverageTopFiveScores {
	
	 public int[][] highFive(int[][] items) {
	        
	        HashMap<Integer , PriorityQueue<Integer>> map = new HashMap<>();
	        
	        for(int i =0; i < items.length ; i++){
	            
	            if(map.get(items[i][0]) == null){
	                PriorityQueue<Integer> values = new PriorityQueue<Integer>();
	                values.add(items[i][1]);
	                map.put(items[i][0], values);
	            }
	            else{
	                var values = map.get(items[i][0]);
	                if(values.size() < 6)
	                	values.add(items[i][1]);
	                else {
		                if(values.peek() < items[i][1]) {
		                	values.poll();
		                	values.add(items[i][1]);
		                }

	                }
	            
	            }
	        }
	        
	        int[][] res = new int[map.size()][2];
	        int j = 0;
	        for(int i : map.keySet()){
	            
	            res[j][0] = i;
	            int sum = 0;
	            
	            for(int k : map.get(i)){
	                sum += k;

	            }
	            
	            res[j][1] = sum/5;
	            
	        }
	        
	        return res;
	    }

}
