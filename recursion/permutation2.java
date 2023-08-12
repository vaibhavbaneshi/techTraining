package recursion;

public class permutation2 {
    
    public static void perm(String input,String output) {
        if(input.length() == 0) {
            System.out.print(output+",");
            return;
        }
        for(int i=0;i<input.length();i++) {
            char singleChar = input.charAt(i);
            String remaingiString = input.substring(0, i) + input.substring(i+1);
            perm(remaingiString,output+singleChar);
        }
    }

    public static void main(String[] args) {
        perm("abc","");
    }
}
