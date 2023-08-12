package recursion;

public class keypadPrint {
    static String[] arr = {"","abc","def","ghi","jkl","mno","pqrs","tu","vws","yz"};
    public static void printKeyPad(String s,int index,String finalCombination) {
       
        if(index == s.length()) {
            System.out.print(finalCombination+",");
            return;
        }

        char currentChar = s.charAt(index);
        String str = arr[currentChar - '0'];

        for(int i=0;i<str.length();i++) {
            printKeyPad(s, index+1, finalCombination+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        printKeyPad("23", 0, "");
    }
}
