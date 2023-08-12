package string;

public class stockDayProfit {
    
    public static int[] checkDaysProfit(int[] arr) {
        int[] daysProfit = new int[arr.length];
        if(arr.length == 0) {
            return null;
        }

        for(int i=0;i<arr.length;i++) {
            daysProfit[i] = countDays(arr,i);
        }

        return daysProfit;
    }

    public static int countDays(int[] arr,int i) {
        int count=1;
        int num = arr[i];
        for(int j=i-1;j>=0;j--) {
            if(arr[j] <= num) {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {90,80,110,60,150,85};
        int[] result = checkDaysProfit(arr);

        for(int e : result) {
            System.out.print(e+" ");
        }
    }
}
