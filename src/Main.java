import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your grade (9 - 11) : ");
        String unconvertedGrade = s.nextLine();
        int grade = Integer.parseInt(unconvertedGrade);

        while (grade < 9 || grade > 11) {
            System.out.println("Please enter a number between 9 and 11 to represent your grade!");
            System.out.print("Enter your grade (9 - 11) : ");
            unconvertedGrade = s.nextLine();
            grade = Integer.parseInt(unconvertedGrade);
        }

        System.out.println("Hello " + name + ", welcome to Brooklyn Tech Simulator! In this simulator, you will have to go through a 2 week 10-day cycle of a Brooklyn Tech student. \nIn these 10 days, you will have to take exams, do classwork, answer questions when the teacher calls you out, and more!");
        System.out.print("Would you like to start? (1 for yes, anything else for no): ");
        String startOrNot = s.nextLine();

        if (!startOrNot.equals("1")) {
            System.exit(0);
        }

        int score =  100;
        Student student = new Student(name, grade, score);
        Schedule schedule = new Schedule(grade);
        String fullPrompt;
        String correctAnswer;
        String prompt;
        String answer;

        for (int day = 1; day < 11; day++) {

            System.out.println("Today is day " + day + "!");

            for (int period = 1; period < 10; period++) {

                System.out.println("Period " + period + " is starting!");

                if (period == 1) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 2) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 3) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 4) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 5) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 6) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 7) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else if (period == 8) {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }

                else {
                    System.out.println("You have " + schedule.getYourClass(day, period) + "!");
                }


                fullPrompt = schedule.assignWork();
                if (fullPrompt.indexOf("*") != -1) {
                    correctAnswer = fullPrompt.substring(fullPrompt.indexOf("*") - 1, fullPrompt.indexOf("*"));
                    prompt = fullPrompt.substring(0 , fullPrompt.indexOf("*")) + fullPrompt.substring(fullPrompt.indexOf("*") + 1);

                    System.out.println(prompt);
                    System.out.print("Enter your answer here: ");
                    answer = s.nextLine();

                    if (!schedule.checkAnswer(correctAnswer, answer)) {
                        if (schedule.getWork().equals("Teacher Question")) {
                            student.subtractScore(1);
                        }

                        else if (schedule.getWork().equals("Worksheet")) {
                            student.subtractScore(3);
                        }

                        else if (schedule.getWork().equals(("Exam"))) {
                            student.subtractScore(5);
                        }
                    }

                    else {
                        System.out.println(fullPrompt);
                    }
                }
                }
            }
        System.out.println("Your grade at the end of these 2 weeks was " + student.getOverallScore() + "!");
    }
}

