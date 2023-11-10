package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class kahnAlgo {

    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> output, int V) {
        
        int inDegree[] = new int[V];
        for(int i=0;i<V;i++) {
            for(int it : adj.get(i)) {
                inDegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++) {
            if(inDegree[i] == 0)
                q.add(i);
        }

        while(!q.isEmpty()) {
            int curr = q.peek();
            q.remove();
            output.add(curr);

            for(int it : adj.get(curr)) {
                inDegree[it]--;

                if(inDegree[it] == 0)
                    q.add(it);
            }
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

        ArrayList<Integer> output = topoSort(adj, new ArrayList<>(), v+1);

        System.out.println("Topology Sort using Kahn's Algorithm : "+output);
    }
}