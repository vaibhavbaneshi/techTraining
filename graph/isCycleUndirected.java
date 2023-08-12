package graph;

import java.util.ArrayList;

class Edge {
    int src;
    int dest;

    Edge(int src,int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class isCycleUndirected {
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2,3)); 

        graph[3].add(new Edge(3,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,4));
    }

    public static boolean isCycleUndirectedPresent(ArrayList<Edge> graph[],boolean[] vis,int current,int parent) {
        vis[current] = true;

        for(int i=0;i<graph[current].size();i++) {
            Edge e = graph[current].get(i);
            if(!vis[e.dest] && parent != e.dest) {
                return true;
            }
            else if(!vis[e.dest]) {
                if(isCycleUndirectedPresent(graph, vis, e.dest, current)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycleUndirectedPresent(graph, new boolean[V], 0, -1));
    }
}
