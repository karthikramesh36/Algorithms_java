package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * We have jobs: difficulty[i] is the difficulty of the ith job, and profit[i] is the profit of the ith job. 

Now we have some workers. worker[i] is the ability of the ith worker, which means that this worker can only complete a job with difficulty at most worker[i]. 

Every worker can be assigned at most one job, but one job can be completed multiple times.

For example, if 3 people attempt the same job that pays $1, then the total profit will be $3.  If a worker cannot complete any job, his profit is $0.

What is the most profit we can make?

Example 1:

Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100 
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get profit of [20,20,30,30] separately.
Notes:

1 <= difficulty.length = profit.length <= 10000
1 <= worker.length <= 10000
difficulty[i], profit[i], worker[i]  are in range [1, 10^5]



Approach:

	Pair up the difficulty and profit and sort it
	
	sort the worker array

	for each worker 
		find the best profit that can be made by that worker 
		i.e. workers ability that can satisfy the difficulty of work and get corresponding skill.
		
		add up best profit for each worker to give the maximum profit that can be made by all the workers
 */
public class MostProfitAssigningWork {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    	
    	List<int[]> pairs = new ArrayList<>();
    	
    	for(int i =0; i< difficulty.length; i ++) {
    		int[] pair = new int[] { difficulty[i], profit[i]};
    		pairs.add(pair);
    		}
    	
    	Arrays.sort(worker);
    	Collections.sort(pairs, (a,b) -> a[0] - b[0]);
    	int res =0, best =0, i=0, N = pairs.size();
    	for(int ability : worker) {
    		while(i < N && ability >= pairs.get(i)[0])
    			best = Math.max(best, pairs.get(i++)[1]);
    		res += best;
    	}
    	
    	return res;
    }

}
