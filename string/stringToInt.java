package string;

public class stringToInt {
    
    public static int convert(String s) {
        int n = 0;
        int sign = 1;
        for(int i=0;i<s.length();i++) {

            if(n >Integer.MAX_VALUE/10 || (n == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > Integer.MAX_VALUE%10)) {
                return sign==1?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            if(n <= Integer.MIN_VALUE/10) {
                return Integer.MIN_VALUE;
            }

            if(s.charAt(i) == '-') {
                sign = -1;
            }
            if(Character.isDigit(s.charAt(i))){
                n = n* 10 + s.charAt(i) - '0';
            }
        }
        return sign*n;
    }

    public static void main(String[] args) {
        System.out.println(convert("2147483647"));
    }
}
