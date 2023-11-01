public class Student {

    private String name;

    private int grade;

    private double gpa;
    public Student (String name, int grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }
}
