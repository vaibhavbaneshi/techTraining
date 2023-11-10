package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class distSrcToDes {
    
    public static int[] findDist(ArrayList<ArrayList<Integer>> adj, int[] dist, boolean[] vis, int v, int src, int dest) {

        for(int i=1;i<v;i++) {
            adj.add(new ArrayList<>());
            dist[i] = Integer.MAX_VALUE;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;

        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int i=1;i<adj.get(curr).size();i++) {
                int n = adj.get(curr).get(i);
                if(vis[n] == false) {
                    vis[n] = true;
                    dist[n] = dist[curr] + 1;
                    q.add(n);

                    if(n == dest) 
                        return dist;
                }
            }
        }

        return null;
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

        int[] dist = new int[v+1];

        int[] output = findDist(adj, dist, new boolean[v+1], v, 1, 6);

        Arrays.sort(output);

        System.out.println("The distance between source and destination is : "+output[output.length-1]);
    }
}
