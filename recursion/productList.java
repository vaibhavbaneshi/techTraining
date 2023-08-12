package recursion;

import java.util.ArrayList;

public class productList {
    
    public static ArrayList<Integer> printList(ArrayList<Integer> list,int result,int i) {

        if(i == list.size()) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(result);
            return arr;
        }
        result *= list.get(i);
        ArrayList<Integer> temp = printList(list, result,++i);
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> output = printList(list,1,0);
        System.out.println(output);
    }
}