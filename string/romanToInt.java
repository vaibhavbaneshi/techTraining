package string;

import java.util.HashMap;

public class romanToInt {

    public static int convert(String s) {
        int ans=0,index=0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        while(index < s.length()) {
            if(map.containsKey(s.charAt(index))) {

                if(index < s.length()) {
                    ans += map.get(s.charAt(index));
                }

                if(s.charAt(index) < s.charAt(index+1)) {
                    ans = map.get(s.charAt(index+1)) - map.get(s.charAt(index));
                    System.out.println(ans);
                    index += 1;
                }
                ans += map.get(s.charAt(index));
            }
            index += 1;
        }  
        return ans;  
    }

    public static void main(String[] args) {
        System.out.println(convert("IV"));
    }
}
