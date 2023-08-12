package string;

public class starChar {
    
    public static String insertStar(String str) {
        String temp = "";

        for(int i=0;i<str.length();i++) {

            if(i == str.length()-1) {
                temp += str.charAt(i);
                break;
            }

            if(str.charAt(i) != str.charAt(i+1)) {
                temp += str.charAt(i);
            }

            if(str.charAt(i) == str.charAt(i+1)) {
                temp += str.charAt(i) + "*";
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(insertStar("aabbcc"));
    }
}
