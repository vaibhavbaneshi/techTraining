package recursion;

import java.util.ArrayList;

public class diceGame {
    
    public static ArrayList<String> game(int currentValue,int target) {
        if(currentValue == target) {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        if(currentValue > target) {
            ArrayList<String> arr = new ArrayList<>();
            return arr;
        }
        ArrayList<String> result = new ArrayList<>();
        for(int dice=1;dice<=6;dice++) {
            ArrayList<String> temp = game(currentValue+dice,target);
            for(String  s : temp) {
                result.add(dice+s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> output = game(0,10);
        System.out.println(output);
        System.out.println(output.size());
    }
}
