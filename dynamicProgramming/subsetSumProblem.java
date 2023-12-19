package dynamicProgramming;

public class subsetSumProblem {

    public static boolean isSubsetSum(int N, int[] arr, int sum) {
        boolean[][] output = new boolean[N+1][sum+1];

        for(int i=0;i<N+1;i++)
            for(int j=0;j<sum+1;j++) {

                if(i == 0)
                    output[i][j] = false;

                if(j == 0)
                    output[i][j] = true;
                
                if(i > 0 &&  arr[i-1] <= j)
                    output[i][j] = output[i-1][j - arr[i-1]] || output[i-1][j];

                else if(i > 0)
                    output[i][j] = output[i-1][j];
            }

        return output[N][sum];
    }
    
    public static void main(String[] args) {
        
    }
}
