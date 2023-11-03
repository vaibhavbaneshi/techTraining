package graph;

import java.util.ArrayList;

public class creatingGraph {

    public static void main(String[] args) {

        int n = 4; // Increase the size by 1 to include vertices from 1 to 3
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        for (int i = 1; i < n; i++) { // Start from 1 since the vertices are from 1 to 3
            System.out.print(i + " is connected to: ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
