package graph;

import java.util.*;

class depthFirstSearch {

    public static ArrayList<Integer> dfsGraph(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result,boolean[] vis, int src) {

        vis[src] = true;
        result.add(src);

        for(Integer it : adj.get(src)) {
            if(!vis[it])
                dfsGraph(adj, result, vis, it);
        }

        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=6;
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(1).add(5);

        adj.get(2).add(1);
        adj.get(2).add(5);

        adj.get(3).add(4);
        adj.get(3).add(1);

        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(4).add(6);

        adj.get(5).add(1);
        adj.get(5).add(2);
        adj.get(5).add(4);
        adj.get(5).add(6);

        adj.get(6).add(5);
        adj.get(6).add(4);

        ArrayList<Integer> output = dfsGraph(adj, new ArrayList<>(), new boolean[v+1],1);

        System.out.println("The DFS traversal is : "+output);
    }
}