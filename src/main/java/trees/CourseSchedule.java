package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/* 
There are a total of n courses you have to take, labeled from 0 to n-1.

Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

Example 1:

Input: 2, [[1,0]] 
Output: true
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: 2, [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
             To take course 1 you should have finished course 0, and to take course 0 you should
             also have finished course 1. So it is impossible.
Note:

The input prerequisites is a graph represented by a list of edges, not adjacency matrices. Read more about how a graph is represented.
You may assume that there are no duplicate edges in the input prerequisites.
*/

public class CourseSchedule {

    /* algorithm outline 

    S - a queue containing all nodes with no incoming edges
    L - list representing topological sort
    
    for every node n in S: ( pop from queue node n)
        add node n to L to print out topological order
        a neighbor node m of node n in S is if it is connected from S by an outgoing edge

        for every node m:
            remove the edge from n to m
            if m has no more incoming edges then add m to S
        
    finally if graph still has edges left then there is a cycle 

    else return true , and can also print the topological order.
    */

    public static boolean topologicalSort(int numCourses, int [][] prerequisites) {
        
		List<Integer>[] nodes =  new List[numCourses];

        int[] incomingEdges = new int[numCourses];
        
        for(int i =0; i<nodes.length; i++){
            nodes[i] = new LinkedList<Integer>();
        }

        for (int[] pair : prerequisites){
            nodes[pair[1]].add(pair[0]);
            incomingEdges[pair[0]]++;
        }

        Queue<Integer> queue_nodeswithzeroincomingedges = new LinkedList<Integer>();

        for(int i =0 ; i < incomingEdges.length; i++){
            if(incomingEdges[i] == 0) queue_nodeswithzeroincomingedges.add(i);
        }

        int totalEdgeCount = prerequisites.length;
        while(!queue_nodeswithzeroincomingedges.isEmpty()){

            int current = queue_nodeswithzeroincomingedges.poll();

            for(int node : nodes[current]){
                totalEdgeCount--;
                if(--incomingEdges[node] == 0) queue_nodeswithzeroincomingedges.add(node);

            }
        }

        return totalEdgeCount == 0;
    }
}