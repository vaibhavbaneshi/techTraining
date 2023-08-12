package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Edge {
    int src;
    int dest; // Rename 'dest' to 'dest'
    int wt;

    Edge(int src, int dest, int wt) { // Rename 'dest' to 'dest'
        this.src = src;
        this.dest = dest; // Rename 'dest' to 'dest'
        this.wt = wt;
    }
}

public class shortestPathAlgo {
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dest;

        public Pair(int node,int dest) {
            this.node = node;
            this.dest = dest;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dest - p2.dest;
        }
    }

    // dijktras algo
    public static void findShortestPath(ArrayList<Edge> graph[],int src,int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] dest = new int[V];
        boolean[] vis = new boolean[V];
        

        for(int i=0;i<V;i++) {
            if(i != src) {
                dest[i] = Integer.MAX_VALUE;
            }
        }

        pq.offer(new Pair(src, 0));
        while(!pq.isEmpty()) {
            Pair current = pq.remove();
            if(!vis[current.node]) {
                vis[current.node] = true;

                for(int i=0;i<graph[current.node].size();i++) {
                    Edge e = graph[current.node].get(i); 

                    int u = e.src;
                    int v = e.dest;
                    if(dest[u] + e.wt < dest[v]) {
                        dest[v] = dest[u] + e.wt;
                        pq.add(new Pair(v, dest[v]));
                    }
                }
            }
        }
        for(int i=0;i<V;i++) {
            System.out.print(dest[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        findShortestPath(graph, 0, V);
    }
}
