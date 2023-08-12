package OOPs;

import java.util.*;
public class caller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name, ID, Fees and Marks of a Student : ");
        String name = sc.nextLine();
        studentDetails s1 = new studentDetails(sc.nextInt(),name,sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());  
        setGrades obj = new setGrades();
        obj.calculateGrade(s1);
        printDetails obj1 = new printDetails();
        obj1.print(s1,obj);     
        sc.close();
    }
}