package graph;

import java.util.ArrayList;
import java.util.Stack;

class Edge {
    int src;
    int dest;

    Edge(int src,int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class topologicalSorting {
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topoSort(ArrayList<Edge> graph[],boolean vis[],int current,Stack<Integer> stack) {
        vis[current] = true;

        for(int i=0;i<graph[current].size();i++) {
            Edge e = graph[current].get(i);
            if(!vis[e.dest]) {
                topoSort(graph, vis, e.dest, stack);
            }
        }
        stack.push(current);
    }

    public static void topSortCall(ArrayList<Edge> graph[],int V) {
        Stack<Integer> stack = new Stack<>();
        boolean[] vis = new boolean[V];

        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                topoSort(graph, vis, i, stack);
            }
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] =  new ArrayList[V];
        createGraph(graph);
        topSortCall(graph, V);
    }
}
