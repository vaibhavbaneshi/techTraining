package graph;

import java.util.ArrayList;
import java.util.Stack;

class topologicalSorting {

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, Stack<Integer> stack, int n) {
        vis[n] = true;

        for(int it : adj.get(n)) {
            if(!vis[it])
                dfs(adj,vis,stack,it);
        }

        stack.push(n);
    }

    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> output, boolean[] vis,          
                                              Stack<Integer> stack, int V) {
        for(int i=0;i<V;i++) {
            if(!vis[i])
                dfs(adj, vis, stack, i);
        }
        
        while(!stack.isEmpty()) { 
            output.add(stack.pop());
        }

        return output;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v=5;
        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(2).add(3);

        adj.get(3).add(1);

        adj.get(4).add(0);
        adj.get(4).add(1);

        adj.get(5).add(2);
        adj.get(5).add(0);

        ArrayList<Integer> output = topoSort(adj, new ArrayList<>(), new boolean[v+1], new Stack<>(), v+1);

        System.out.println("Topology Sort : "+output);
    }
}