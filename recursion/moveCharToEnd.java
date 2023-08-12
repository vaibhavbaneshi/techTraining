package recursion;

public class moveCharToEnd {

    public static String addChar(String newString,int count) {
        if(count == 0) {
            return newString;
        }
        newString += 'x';
        return addChar(newString, count-1);
    }

    public static String moveChar(String s,int index,String newString) {
        if(index == s.length()) {
            return newString;
        }
        
        if(s.charAt(index) != 'x') {
            newString += String.valueOf(s.charAt(index));
        }
        
        return moveChar(s, index+1, newString);
    }
    
    public static int countChar(String s,int index,int count) {
        if(index == s.length()) {
            return count;
        }
        if(s.charAt(index) == 'x') {
            ++count;
        }
        return countChar(s, index+1,count);
    }

    public static void main(String[] args) {
        String s = "axbxcxx";
        int count = countChar(s,0,0);
        String str = moveChar(s, 0, "");
        String newString = addChar(str,count);
        System.out.println(newString);
    }
}
