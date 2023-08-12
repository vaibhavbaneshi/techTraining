package taskManager;

import java.util.ArrayList;

import java.util.*;
class input {

    ArrayList<Task> list = new ArrayList<>();
    
    public void createTask(ArrayList<Task> arr, Scanner sc) {
        System.out.print("Enter Name :- ");
        String name = sc.nextLine();
        System.out.print("Enter Description :- ");
        String desc = sc.nextLine();
        Task task = new Task(name, desc);
        arr.add(task);
    }

    public void readAllTask(ArrayList<Task> arr) {
        System.out.println("Name\t\tDesciption");
        for (Task task : arr) {
            System.out.println(task.name + "\t\t" + task.desc);
        }
    }

    public void updateTask(ArrayList<Task> arr, Scanner sc) {
        System.out.println("Enter Task Name :- ");
        String name = sc.nextLine();
        Task x = null;
        for (Task task : arr) {
            if (task.name.equals(name)) {
                x = task;
                break;
            }
        }
        if (x == null)
            System.out.println("Task not found !");
        else {
            System.out.println("Enter updated Description :- ");
            String desc = sc.nextLine();
            x.desc = desc;
            System.out.println("Task Updated Successfully");
        }
    }

    public void deleteTask(ArrayList<Task> arr, Scanner sc) {
        System.out.println("Enter Task Name to be deleted :- ");
        String name = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < arr.size(); i++) {
            Task x = arr.get(i);
            if (x.name.equals(name)) {
                arr.remove(i);
                flag = false;
                break;
            }
        }
        if (flag == true)
            System.out.println("Task not found !");
        else
            System.out.println("Task Deleted Successfully");
    }
}
