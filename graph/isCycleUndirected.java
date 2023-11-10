package graph;

import java.util.ArrayList;  

class isCycleUndefined {

    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int parent,int src) {
        vis[src] = true;

        for(int it : adj.get(src)) {
            if(!vis[it]) {
                if(dfs(adj, vis, src, it))
                    return true;
            }

            else if(parent != it)
                return true;
        }

        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj,boolean[] vis,int parent,int V) {

        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                if(dfs(adj,vis,-1,i)) 
                    return true;
            } 
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int v = 6;

        for(int i=0;i<v;i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(4);

        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(4);

        adj.get(2).add(1);
        adj.get(2).add(3);

        adj.get(3).add(2);

        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(4).add(5);

        adj.get(5).add(4);
        

        boolean output = isCycle(adj,new boolean[v+1],-1,v);

        System.out.println("Is there a loop in the graph : "+output);
    }
}