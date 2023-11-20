/**
 * The Student class represents a student of the school. A student is a person who is studying at a school with an overall score
 */
public class Student {
    public int overallScore;

    /**
     * Constructor for the Student class. This creates a new instance of a Student given the below parameters
     * @param name represents the students name
     * @param grade represents the students grade
     * @param score represents the students score
     */
    public Student(String name, int grade, int score) {


    }

    /**
     * subtractScore method simply subtracts from the overall score
     * @param subtrahend represents the amount that is being subtracted from the overall score
     */
    public void subtractScore(int subtrahend) {
        overallScore = overallScore -  subtrahend;
    }

    /**
     * getOverallScore method simply returns the overall score
     * @return returns an int that is greater than or equal to 0 depending on how the user did
     */
    public int getOverallScore() {
        if (overallScore < 0) {
            overallScore = 0;
        }

        return overallScore;
    }
}