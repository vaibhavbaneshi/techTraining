package recursion;

public class climbStairs {
    
    public static int climb(int n) {
        if(n == 1 || n== 0) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        else {
            return climb(n-2) + climb(n-1);
        }
    }

    public static void main(String[] args) {
        int result = climb(4);
        System.out.println(result);
    }
}
