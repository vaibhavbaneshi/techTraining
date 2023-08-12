package string;

public class RabinKarp {
    
    public static long hashValue(String str) {
        long hashValue=0;

        for(int i=0;i<str.length();i++) {
            hashValue += str.charAt(i) + Math.pow(10,i);
        }

        return hashValue;
    }

    public static boolean searchPattern(String str,String pattern) {

        long patternHash = hashValue(pattern);
        for(int i=0;i<str.length() - pattern.length();i++) {
            long textHashValue = hashValue(str.substring(i,i + pattern.length()));

            if(patternHash == textHashValue && pattern.equals(str.substring(i,i + pattern.length()))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchPattern("abcdabc","abd"));
    }
}
