package recursion;

import java.util.*;

public class subSeqIterative {

    public static ArrayList<String> print(String s) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char currentChar = s.charAt(i);
            if(list.size() == 0) {
                list.add("");
                list.add(""+currentChar);
                continue;
            }
            int n = list.size();
            for(int j=0;j<n;j++) {
                if(!list.contains(list.get(j) + currentChar)) {
                    list.add(list.get(j) + currentChar);
                }
            }
        }
        return list;
    } 

    public static void main(String[] args) {
        String s = "vaibhav";
        ArrayList<String> output = print(s);
        System.out.println(output);
        System.out.println(output.size());
    }
}
