import java.util.ArrayList;
import java.util.Collections;

class practise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.reverse(list);

        for(int e : list) {
            System.out.print(e+" ");
        }
    }
}