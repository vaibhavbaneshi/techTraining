package recursion;
import java.util.Arrays;

public class capitalArray {
    
    public static String[] printArray(String[] str,int i,String[] str1) {

        if(i == str.length) {
            String[] s = Arrays.copyOfRange(str1,0,str1.length);
            return s;
        }
        str1[i] = str[i].toUpperCase();
        String[] str2 = printArray(str, ++i,str1);
        return str2;
    }

    public static void main(String[] args) {
        String[] str = {"foo","bar","world"};
        String[] str2 = new String[str.length];
        String[] str1 = printArray(str,0,str2);
        for(String s : str1) {
            System.out.println(s);
        }
    }
}