package OOPs;

public class studentDetails {
    private int id;
    private String name;
    private double fees;
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;
    private double marks5;

    public studentDetails() {
        
    }

    public studentDetails(int id,String name,double fees,double marks1,double marks2,double marks3,double marks4,double marks5) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
        this.marks5 = marks5;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setMarks1(double marks1) {
        this.marks1 = marks1;
    }

    public void setMarks2(double marks2) {
        this.marks2 = marks2;
    }

    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }

    public void setMarks4(double marks4) {
        this.marks4 = marks4;
    }

    public void setMarks5(double marks5) {
        this.marks5 = marks5;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getFees() {
        return this.fees;
    }

    public double getMarks1() {
        return this.marks1;
    }

    public double getMarks2() {
        return this.marks2;
    }

    public double getMarks3() {
        return this.marks3;
    }

    public double getMarks4() {
        return this.marks4;
    }

    public double getMarks5() {
        return this.marks5;
    }    
}
