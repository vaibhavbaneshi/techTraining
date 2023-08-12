package recursion;

import java.util.ArrayList;

public class subSeqRecurion {
    
    public static ArrayList<String> print(String s) {

        if(s.length() == 0) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }

        char currentChar = s.charAt(0);
        String remainingString = s.substring(1);
        ArrayList<String> temp = print(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String str : temp) {
            result.add(str);
            result.add(currentChar+str);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "vaibhav";
        ArrayList<String> output = print(s);
        System.out.println(output);
    }
}
