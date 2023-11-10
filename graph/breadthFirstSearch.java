package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class breadthFirstSearch {

    public static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adj, int V) {
        
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it : adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true;
                    q.add(it); 
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=4;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(0).add(2);
        adj.get(2).add(0);

        ArrayList<Integer> output = bfsGraph(adj,v);

        System.out.println("BFS traversal is : "+output);
    }
}