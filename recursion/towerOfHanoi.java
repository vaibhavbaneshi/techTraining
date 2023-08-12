package recursion;

public class towerOfHanoi {
    
    public static void callTower(int n,String source,String helper,String destination) {

        if(n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        callTower(n-1, source, destination, helper);    
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        callTower(n-1, helper, source, destination);
    }

    public static void main(String[] args) {
        callTower(3, "Source", "Helper", "Destination");
    }
}
