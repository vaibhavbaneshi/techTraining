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

public class isCycleDirected {

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }
    
    public static boolean cycleDirectedPresent(ArrayList<Edge> graph[],boolean[] vis,int current,boolean[] recStack) {
        vis[current] = true;
        recStack[current] = true;

        for(int i=0;i<graph[current].size();i++) {
            Edge e = graph[current].get(i);
            if(recStack[e.dest]) {
                return true;
            }
            else if(!vis[e.dest] && cycleDirectedPresent(graph, vis, e.dest, recStack)) {
                return true;
            }
        }
        recStack[current] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(cycleDirectedPresent(graph, new boolean[V], 0, new boolean[V]));
    }
}
