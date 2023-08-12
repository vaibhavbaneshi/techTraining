package recursion;

public class coinChange {

    static int minValue = Integer.MAX_VALUE;
    public static int getCoin(int[] coins,int amount,int index,String result) {
        if(amount == 0) {
            if(minValue > result.length()) {
                minValue = result.length();
            }
            return minValue;
        }

        for(int i=coins.length-1;i>=0;i--) {
            if(amount >= coins[i]) {
                getCoin(coins,amount-coins[i],i,result+coins[i]);
            }
        }
        return minValue;
    } 

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int output = getCoin(coins,11,0,"");
        System.out.println(output);
    }
}