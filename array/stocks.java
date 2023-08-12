package array;

public class stocks {
    
    public static int checkTime(int[] prices) {

        int min = prices[0];
        int max = 0;
        
        for(int i=1;i<prices.length;i++) {
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(checkTime(prices));
    }
}
