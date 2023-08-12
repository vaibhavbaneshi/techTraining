package string;

import java.util.ArrayList;
import java.util.List;

class longestCommonSubSeq {

    public static List<String> generateSeq(String str) {
        ArrayList<String> subSeqList = new ArrayList<>();
        for(int i=0;i<str.length();i++) {
            char firstChar = str.charAt(i);

            if(str.length() == 0) {
                subSeqList.add(" ");
                subSeqList.add(""+firstChar);
                continue;
            }
            for(int j=0;j<subSeqList.size();j++) {
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }

        return subSeqList;
        
    }

    public static String lcs(String str1,String str2) {

        List<String> subSeq1 = generateSeq(str1);
        List<String> subSeq2 = generateSeq(str2);

        String lcs = "";
        for(String word1 : subSeq1) {
            for(String word2 : subSeq2) {
                if(word1.equals(word2) && word1.length() > lcs.length()) {
                    lcs = word1;
                }
            }
        }
        return lcs;
    }

    public static void main(String[] args) {
        System.out.println(lcs("abc","ayc"));
    }
}