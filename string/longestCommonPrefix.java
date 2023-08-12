package string;

public class longestCommonPrefix {
    
    public static String findLCP(String[] arr) {
        String str = "";
        int index=1;
        for(int i=0;i<arr[0].length();i++) {
            String s = arr[0];
            char c = s.charAt(i);
            for(int j=index;j<arr.length;j++) {
                if(c == arr[j].charAt(i)) {
                    continue;
                }
                else {
                    return str;
                }
            }
            str += c;
        }

        return str;
    }

    public static void main(String[] args) {
        String[] arr = {"list","listen","like"};

        System.out.println(findLCP(arr));
    }
}
