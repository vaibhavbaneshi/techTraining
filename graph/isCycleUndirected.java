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

    }
}