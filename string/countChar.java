package string;

import java.util.HashMap;

public class countChar {
    
    public static HashMap<Character,Integer> count(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count=1;
        
        for(int i=0;i<str.length();i++) {
            count=1;
            for(int j=i+1;j<str.length();j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            map.putIfAbsent(str.charAt(i), count);
        }

        return map;

    }

    public static HashMap<Character,Integer> approach_2(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=i+1,count=1;

        while(i != str.length()-1) {

            if(j == str.length()) {
                ++i;

                if(i == str.length()-1) {
                    map.putIfAbsent(str.charAt(i), count);
                    return map;
                }

                j=i+1;
                count=1;
            }

            if(str.charAt(i) == str.charAt(j)) {
                map.putIfAbsent(str.charAt(i), count+1);
            }
            
            ++j;
        }

        return map;
    }

    public static void main(String[] args) {
        String str = "aaabbcccc";
        HashMap<Character,Integer> map = count(str);

        System.out.println(map);
    }
}
