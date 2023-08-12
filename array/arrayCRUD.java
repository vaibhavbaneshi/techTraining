package array;

public class arrayCRUD {

    int[] arr;
    int size;

    public arrayCRUD(int n) {
        this.arr = new int[n];
        this.size = 0;
    }

    public void insert(int item,int index) {
        
        if(index > size) {
            System.out.println("Index cannot be above the size : ");
            return;
        }
        arr[index] = item;
        size++;
    }

    public void delete(int index) {
        
        if(index > size || index < 0 || index == size) {
            System.out.println("Please give a proper index : ");
            return;
        }

        if(index == size-1) {
            size--;
        }
        else {
            for(int i=index;i<size;i++) {
                arr[i] = arr[i+1];
            }
            size--;
        }
    }

    public void update(int item,int index) {
        if(index > size || index < 0 || index == size) {
            System.out.println("Please give a proper index : ");
            return;
        }
        arr[index] = item;
    }

    public void search(int item) {
        for(int i=0;i<size;i++) {
            if(arr[i] == item) {
                System.out.println("the item is present in the array.");
                return;
            }
        }
        System.out.println("The item is not present in the array.");
    }

    public void print() {
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        arrayCRUD obj = new arrayCRUD(5);
        obj.insert(1, 0);
        obj.insert(2, 1);
        obj.insert(3, 2);
        obj.print();
        System.out.println();
        obj.delete(1);
        obj.print();
        System.out.println();
        System.out.println(obj.size);
        System.out.println();
        obj.update(4,2);
        obj.print();
        System.out.println();
        obj.search(4);
    }
}
