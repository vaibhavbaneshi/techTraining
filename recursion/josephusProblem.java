package recursion;

public class josephusProblem {
    
    public static int solve(int n) {
        int a=0,temp=0;
        for(double i=1;i<=n;i++) {
            temp = (int)Math.pow(2, i);
            if(temp < n) {
                a = temp;
            }
            else {
                break;
            }
        }
        int l  = n-a;
        return 2*l+1;
    }

    public static void main(String[] args) {
        System.out.println(solve(9));
    }
}
