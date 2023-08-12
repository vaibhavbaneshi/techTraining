package string;


public class suffix {
    
    public static String[] findSuffix(String str) {
        String[] suffixes = new String[str.length()];
        int j = str.length()-1;
        String s= "";
        for(int i=0;i<suffixes.length;i++) {
            s = String.valueOf(str.charAt(j)) + s;
            suffixes[i] = String.valueOf(s);
            j--;
        }

        return suffixes;
    }

    public static void main(String[] args) {
        String str = "Brain";
        String[] s = findSuffix(str);

        for(String e : s) {
            System.out.print(e+" ");
        }
    }
}
