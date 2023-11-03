import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class practise {

    public static ArrayList<ArrayList<Integer>> createGraph(int n, int m) {
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();

        for(int i=0;i<n;i++) {
            output.add(new ArrayList<>());
        }

        output.get(1).add(2);
        output.get(2).add(1);

        output.get(2).add(3);
        output.get(3).add(2);

        output.get(1).add(3);
        output.get(3).add(1);

        return output;
    }

    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<Integer> output = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            output.add(node);

            for(Integer it : adj.get(node)) {
                if(vis[it] == false) {
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return output;
    }

    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for(int i=1;i<adj.size();i++) {
            System.out.print(i + " is connected to: ");
            for(int j=0;j<adj.get(i).size();j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> result = createGraph(4, 3);

        print(result);
    }
}