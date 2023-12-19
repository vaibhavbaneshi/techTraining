package dynamicProgramming;

public class knapsackProblemTopDown {

    public static int knapsack(int[] wt, int[] val, int n, int w) {
        int[][] t = new int[n+1][w+1];
        
        for(int i=0;i<n+1;i++) 
            for(int j=0;j<w+1;j++) {

                if(i == 0 || j == 0)
                    t[i][j] = 0;

                if( i > 0 && wt[i-1] <= j)
                    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);

                else if(i > 0)
                    t[i][j] = t[i-1][j];
            }

        return t[n][w];
    }
    
    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};

        int output = knapsack(wt, val, wt.length, 7);

        System.out.println("Max Profit: "+output);
    }
}
