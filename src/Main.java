import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your grade (9 - 12) : ");
        String unconvertedGrade = s.nextLine();
        int grade = Integer.parseInt(unconvertedGrade);
        if (grade >= 9 && grade <= 12) {
            Schedule schedule = new Schedule(grade);
        }
        else {
            System.out.println("Please enter a number between 9 and 12 to represent your grade!");
            System.exit(0);
        }
        Student student = new Student(name, grade);
        System.out.println("Hello " + name + ", welcome to Brooklyn Tech Simulator! In this simulator, you will have to go through a 2 week 10-day cycle of a Brooklyn Tech student. \nIn these 10 days, you will have to take exams, do classwork, answer questions when the teacher calls you out, and more!");
        for (int day = 1; day < 11; day++) {
            System.out.println("Today is day " + day + "!");
            for (int period = 1; period < 10; period++) {
                System.out.println("Period " + period + " is starting!");
            }
        }
    }
}
