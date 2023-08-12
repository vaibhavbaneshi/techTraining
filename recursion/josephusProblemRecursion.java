package recursion;

public class josephusProblemRecursion {
    
    public static int solve(int n,int index,int temp,int a,int l) {

        if(temp > n) {
            l = n-a;
            return 2*l+1;
        }

        if(temp < n) {
            a = temp;
        }

        int result = solve(n,index+1,(int)(Math.pow(2, index)),a,l);

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solve(7,1,0,0,0));
    }
}
