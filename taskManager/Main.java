package taskManager;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<Task>();
        Scanner sc = new Scanner(System.in);
        System.out.println("NAME : VAIBHAV BANESHI");
        System.out.println("SAP_ID : 1000014170");
        System.out.println("Welcome to Task Manager (CRUD)");
        while (true) {
            input obj = new input();
            System.out.println("Menu");
            System.out.println("1. Enter New Task\t4. Delete Task");
            System.out.println("2. Read All Task\t5. Exit");
            System.out.println("3. Update Task");
            int n = sc.nextInt();
            sc.nextLine();
            if (n == 1)
                obj.createTask(list, sc);
            else if (n == 2)
                obj.readAllTask(list);
            else if (n == 3)
                obj.updateTask(list, sc);
            else if (n == 4)
                obj.deleteTask(list, sc);
            else if(n == 5)
                break;
            System.out.println();
        }
        sc.close();
    }
}
