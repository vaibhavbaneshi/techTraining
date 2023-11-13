package graph;

import java.util.ArrayList;

public class numberOfProvince {

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int src) {

        vis[src] = true;

        for(int it : adj.get(src)) {
            if(!vis[it])
                dfs(adj,vis,it);
        }
    }
    
    public static int provinces(ArrayList<ArrayList<Integer>> adj, boolean vis[], int V) {

        int count = 0;

        for(int i=0;i<V;i++) {
            for(int j=0;j<V;j++) {
                if(adj.get(i).get(j) == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);   
                }
            }
        }

        for(int i=0;i<V;i++) {
            if(!vis[i]) {
                count++;
                dfs(adj,vis,i);
            }
        }

        return count;
    } 

    public static void main(String[] args) {
        
    }
}
