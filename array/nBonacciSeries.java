package array;

class nBonacciSeries {

    public static int solve(int n,int nthTerm) {
        int[] arr = new int[nthTerm];

        for(int i=0;i<n-1;i++) {
            arr[i] = 0;
        }

        arr[n-1] = 1;
        int start =-1;
        int second = 0;

        for(int i=n;i<arr.length;i++) {
            if(start == -1) {
                arr[i] = arr[i-1];
            }
            else {
                second = arr[i-1] - arr[start];
                arr[i] = arr[i-1] + second;
            }
            start++;
        }

        return arr[nthTerm-1];
    }

    public static void main(String[] args) {
        System.out.println(solve(3,15));
    }
}