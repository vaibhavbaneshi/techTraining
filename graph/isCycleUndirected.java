package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    
    int data;
    int parent;

    Pair(int data, int parent) {
        this.data = data;
        this.parent = parent;
    }
}

class isCycleUndirected {

    public static boolean checkCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int src) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        vis[src] = true;

        while(!q.isEmpty()) {
            int data = q.peek().data;
            int parent = q.peek().parent;
            q.poll();

            for(int it : adj.get(data)) {
                if(!vis[it]) {
                    vis[it] = true;
                    q.offer(new Pair(it,data));
                }

                else if(parent != it) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int V) {

        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++) {
            if(checkCycle(adj,new boolean[V],i))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}