package OOPs;

public class printDetails {
    public void print(studentDetails s1,setGrades obj) {
        System.out.println("The ID of the student is : "+s1.getId());
        System.out.println("The name of the student is : "+s1.getName());
        System.out.println("The fees of the studnt is : "+s1.getFees());
        System.out.println("The marks of student is 5 subjects are : "+s1.getMarks1()+" "+s1.getMarks2()+" "+s1.getMarks3()+" "+s1.getMarks4()+" "+s1.getMarks5());
        System.out.println("The grade assigned is : "+obj.getGrade());
    }
}
