package recursion;
import java.util.ArrayList;

public class permutation {

    public static ArrayList<String> perm(String str) {
        if(str.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> temp = perm(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            for(int i=0;i<=s.length();i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i,currentChar);
                result.add(sb.toString());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        ArrayList<String> output = perm(s);
        System.out.println(output);
    }
}
