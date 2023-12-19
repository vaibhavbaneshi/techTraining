package dynamicProgramming;

public class knapsackProblem {
    static int[][] t = new int[102][102];

    public static int knapsack(int[] wt, int val[], int w, int n) {

        if(w == 0 || n == 0)
            return 0;

        if(t[n][w] != -1)
            return t[n][w];

        if(wt[n-1] <= w) 
            return t[n][w] = Math.max(val[n-1] + knapsack(wt, val, w - wt[n-1], n - 1), knapsack(wt, val, w, n-1));
        
        else     
            return knapsack(wt, val, w, n-1);
    }

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};

        for(int i=0;i<t.length;i++) {
            for(int j=0;j<t[0].length;j++) 
                t[i][j] = -1;
        }
        
        int output = knapsack(wt, val, 7, wt.length);

        System.out.println("Max Profit: "+output);
    }
}
