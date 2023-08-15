package slidingWindow;

import java.util.HashMap;

public class countOccurrenceAnagram {

    public static int countAnagram(String s,String pattern) {
        int strLen = s.length();
        int patternLen = pattern.length();
        int count=0;
        int i=0,j=0;
        HashMap<Character,Integer> mapPat = new HashMap<>();

        for(int k=0;k<patternLen;k++) {
            if(!mapPat.containsKey(pattern.charAt(k)))
                mapPat.put(pattern.charAt(k),1);
            
            else 
                mapPat.put(pattern.charAt(k),mapPat.get(pattern.charAt(k))+1);
        }
        
        while(j < strLen) {
            if(j-i+1 < patternLen)
                j++;
            
            else {
                HashMap<Character,Integer> mapStr = new HashMap<>();
                for(int k=i;k<=j;k++) {
                    if(!mapStr.containsKey(s.charAt(k)))
                        mapStr.put(s.charAt(k),1);
            
                    else 
                        mapStr.put(s.charAt(k),mapStr.get(s.charAt(k))+1);
                }

                if(mapPat.equals(mapStr))
                    count++;
                
                i++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAnagram("forxxorfxaofr", "for"));
    }
}