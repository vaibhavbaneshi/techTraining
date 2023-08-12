package OOPs;

public class setGrades {
    private char grade;
    public void calculateGrade(studentDetails s1) {
        int avgMarks = (int)(s1.getMarks1() + s1.getMarks2() + s1.getMarks3() + s1.getMarks4() + s1.getMarks5())/5;
        if(avgMarks >= 90) {
            setGrade('A');
        }

        else if(avgMarks < 90 && avgMarks >= 80) {
            setGrade('B');
        }
        else if(avgMarks < 80 && avgMarks >= 70) {
            setGrade('C');
        }
        else {
            setGrade('D');
        }
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
}
