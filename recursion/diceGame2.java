package recursion;

public class diceGame2 {
    
    public static void game(int current,int end,String output) {
        if(current == end) {
            System.out.print(output+",");
            return;
        }
        if(current > end) {
            return;
        }
        for(int dice=1;dice<= 6;dice++) {
            game(current+dice,end,output+dice);
        }
    }

    public static void main(String[] args) {
        game(0,10,"");
    }
}
