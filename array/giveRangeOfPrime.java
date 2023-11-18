package array;

public class giveRangeOfPrime {
    public static int checkPrime(int N) {
        int count = 0;
        int flag = 0;
        int a = 0;

        while(true) {
            if(count == N) 
                break;
            
            else {
                a += 1;

                for(int i=2;i<=a;i++) {
                    if(a%i == 0)
                        flag += 1;
                }

                if(flag == 1)
                        count += 1;

                flag = 0;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int N = 5;
        if(N == 0 || N == 1)
            System.out.println(N+" is neither prime nor composite number.");
            
        System.out.println(checkPrime(N));
    }
}
