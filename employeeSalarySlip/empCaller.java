package employeeSalarySlip;
import java.util.*;
public class empCaller {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        messageResourceBundle obj = new messageResourceBundle();

        System.out.println(obj.getValue("welcome_msg"));

        int empId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter emp name : ");
        String empName = sc.nextLine();

        System.out.println("Enter emp email : ");
        String empEmail = sc.nextLine();

        System.out.println("Enter emp basic salary : ");
        double empSalary = sc.nextDouble();

        empDetails e1 = new empDetails(empId,empName,empSalary,empEmail);

        System.out.println(e1);

        sc.close();
    }
}
