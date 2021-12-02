package Algorithms.BFS;

import java.util.LinkedList;
import java.util.Queue;

class Graph
{
    //number of nodes in the graph
    private int V;   
    //adjacency list                           
    private LinkedList<Integer> adj[];  
    //maintaining a queue            
    private Queue<Integer> queue;                   
 
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }

 
    // edges are bidirectional
    void addEdge(int v,int w)
    {
        adj[v].add(w);                          
    }
 
    void BFS(int n)
    {
        boolean nodes[] = new boolean[V];       
        int a = 0;
 
        nodes[n]=true;
        // we are adding root node to top of Queue structure                  
        queue.add(n);                   
 
        while (queue.size() != 0)
        {
            // take 1st from queue to compute it
            n = queue.poll();             
            System.out.print(n+" ");           
 
            // take all neighbors into queue
            for (int i = 0; i < adj[n].size(); i++)  
            {
                a = adj[n].get(i);

                // check if node was already visited
                if (!nodes[a])                    
                {
                    nodes[a] = true;
                    queue.add(a);
                }
            }  
        }
    }

    public static void main(String args[])
    {
        Graph graph = new Graph(6);
 
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);
 
        System.out.println("BFS output:");
 
        graph.BFS(0);
    }
}