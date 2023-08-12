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

public class allPathSrcToDest {
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void findPath(ArrayList<Edge> graph[],boolean vis[],int current,String path,int target) {
        if(current == target) {
            System.out.println("Path : "+path);
            return;
        }
        for(int i=0;i<graph[current].size();i++) {
            if(!vis[current]) {
                Edge e = graph[current].get(i);
                vis[current] = true;
                findPath(graph, vis,e.dest, path+" "+e.dest, target);
                vis[current] = false;
            }  
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src=0,target=5;
        findPath(graph,new boolean[V],src, "0", target);
    }
}
