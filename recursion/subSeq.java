package recursion;

public class subSeq {
    
    public static void printSubSeq(String s,int index,String output) {
        if(index == s.length()) {
            System.out.print(output+",");
            return;
        }
        char currentChar = s.charAt(index);

        printSubSeq(s,index+1,output+currentChar);
        
        printSubSeq(s,index+1,output);
    }
    public static void main(String[] args) {
        printSubSeq("vaibhav",0,"");
    }
}
