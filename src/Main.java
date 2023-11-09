import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your grade (9 - 11) : ");
        String unconvertedGrade = s.nextLine();
        int grade = Integer.parseInt(unconvertedGrade);
        Student student = new Student(name, grade);
        System.out.println("Name is " + name);
        System.out.println("Grade is " + grade);
        for (int day = 1; day < 11; day++) {
            System.out.println("Today is day " + day + "!");
            for (int period = 1; period < 10; period++) {
                System.out.println("Period " + period + " is starting!");
            }
        }
    }
}
