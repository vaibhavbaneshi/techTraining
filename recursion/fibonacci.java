package recursion;

public class fibonacci {
    
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int result = fib(n-1) + fib(n-2);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}