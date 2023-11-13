import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class practise {

    public static ArrayList<ArrayList<Integer>> createGraph(int v) {
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
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

        return adj;
    }

    public static ArrayList<Integer> bfsGraph(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<Integer> output = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        vis[1] = true;

        while(!q.isEmpty()) {
            int curr = q.poll();
            output.add(curr);

            for(int i=0;i<adj.get(curr).size();i++) {
                int n = adj.get(curr).get(i);
                if(!vis[n]) {
                    vis[n] = true;
                    q.add(n);
                }
            }
        }

        return output;
    }

    public static ArrayList<Integer> dfsGraph(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean vis[], int src) {

        vis[src] = true;
        result.add(src);

        for(int it : adj.get(src)) {
            if(!vis[it]) {
                dfsGraph(adj, result, vis, it);
            }
        }

        return result;
    }

    public static void topoDFS(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result, boolean vis[], Stack<Integer> stack, int src) {

        vis[src] = true;
        result.add(src);

        for(int i=0;i<adj.get(src).size();i++) {
            if(!vis[i])
                dfsGraph(adj, result, vis, i);
        }

        stack.push(src);
    }

    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> output, boolean[] vis, int V) {

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<V;i++) {
            if(!vis[i])
                dfsGraph(adj,output,vis,i);
        }

        while(!stack.isEmpty()) {
            output.add(stack.pop());
        }

        return output;
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for(int i=1;i<adj.size()-1;i++) {
            System.out.print(i + " => ");
            for(int j=0;j<adj.get(i).size();j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> result = createGraph(v+1);
        System.out.println("The graph is : ");
        print(result);

        ArrayList<Integer> bfsList = bfsGraph(result, v+1); 
        System.out.print("BFS : ");
        System.out.println(bfsList);

        ArrayList<Integer> dfsList = dfsGraph(result, new ArrayList<>(), new boolean[v+1], 1); 
        System.out.print("DFS : ");
        System.out.println(dfsList);

        ArrayList<Integer> output = topoSort(result, new ArrayList<>(), new boolean[v+1], v); 
        System.out.print("Topology Sort : ");
        System.out.println(output);
    }
}