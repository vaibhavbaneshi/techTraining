class practise {

    public static int knapsack(int wt[], int val[], int bagWt) {
        int maxProfit = Integer.MIN_VALUE;
        int calculatedWt = 0;
        int calculatedProfit = Integer.MIN_VALUE;
        int i=0,j=1;

        while(true) {

            if(j == wt.length)
                break;

            if(calculatedWt >= bagWt) {
                i += 1;
                j = i + 1;
                calculatedProfit = 0;
                calculatedWt = 0;
                maxProfit = 0;
            }
            
            else {
                for(int k=i;k<=j;k++) {
                    calculatedWt = wt[k] + wt[k];
                    calculatedProfit = val[k] + val[k];

                    maxProfit = Math.max(maxProfit, calculatedProfit);
                }
                j += 1;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int output = knapsack(wt, val, 7);

        System.out.println(output);
    }
}