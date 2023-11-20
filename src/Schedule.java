import java.util.Arrays;

/**
 * The Schedule class represents the student's schedule. A schedule is a program card that shows a student what classes he has.
 *
 */
public class Schedule {
    private int theGrade;
    public String currentClass;
    public String work;

    /**
     * Constructor for the Schedule class. This creates a new instance of a Schedule given the parameter below.
     * @param grade represents the grade of the student.
     */
    public Schedule(int grade) {
        theGrade = grade;
    }

    /**
     * getYourClass method for the Schedule class. This method will return the class you have depending on your grade.
     * @param day represents the day in the 10-day cycle
     * @param period represents the period in the day
     * @return returns a String of the class that is occurring
     */
    public String getYourClass(int day, int period) {
        if (theGrade == 9) {
            String[] schedule = {"Living Environment", "Physical Education", "English 9", "English 9", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Freshman Advisory", "DDP (Design, Draft, Production)", "DDP (Design, Draft, Production)", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Physical Education", "English 9", "English 9", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Living Environment Lab", "DDP (Design, Draft, Production)", "DDP (Design, Draft, Production)", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Physical Education", "English 9", "English 9", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Freshman Advisory", "DDP (Design, Draft, Production)", "DDP (Design, Draft, Production)", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Physical Education", "English 9", "English 9", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Living Environment Lab", "DDP (Design, Draft, Production)", "DDP (Design, Draft, Production)", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Physical Education", "English 9", "English 9", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch", "Living Environment", "Gap Lunch", "DDP (Design, Draft, Production)", "DDP (Design, Draft, Production)", "Pre-AP World History", "Spanish I", "Algebra / Geometry", "Algebra / Geometry", "Lunch"};
            currentClass = schedule[(((day - 1) * 9) + period) - 1];
            return schedule[(((day - 1) * 9) + period) - 1];
        }

        else if (theGrade == 10) {
            String[] schedule = {"Spanish II", "English 10", "Algebra 2", "Chemistry", "Physical Education", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Chemistry Lab", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Physical Education", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Sophomore Advisory", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Physical Education", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Chemistry Lab", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Physical Education", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Sophomore Advisory", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Physical Education", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch", "Spanish II", "English 10", "Algebra 2", "Chemistry", "Gap Lunch", "AP Computer Science Principles", "Lunch", "AP World History", "Lunch"};
            currentClass = schedule[(((day - 1) * 9) + period) - 1];
            return schedule[(((day - 1) * 9) + period) - 1];
        }

        else if (theGrade == 11){
            String[] schedule = {"AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physical Education", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physics Lab", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physical Education", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Gap Lunch", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physical Education", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physics Lab", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physical Education", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Gap Lunch", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Physical Education", "AP Computer Science A", "AP Computer Science A", "AP English Language", "AP US History", "Pre-Calculus", "Spanish III", "Lunch", "Physics", "Gap Lunch", "AP Computer Science A", "AP Computer Science A", "AP English Language"};
            currentClass = schedule[(((day - 1) * 9) + period) - 1];
            return schedule[(((day - 1) * 9) + period) - 1];
        }

        return "";
    }

    /**
     * The assignWork method will get a random number that will decide what form of work will be given. Then, based on the current class, will find the question that is tied to that class and form of work.
     * @return returns a String of a formatted question that the user will have to answer.
     */
    public String assignWork() {
        int decider = (int)(Math.random() * 10) + 1;
        work = "";

        if (decider >= 1 && decider <= 5) {
            work = "Teacher Question";
        }

        else if (decider >= 6 && decider <= 9) {
            work = "Worksheet";
        }

        else {
            work = "Exam";
        }

        if (work.equals("Teacher Question")) {

            if (currentClass.equals("Living Environment")) {
                return "Within which structure of an animal cell does DNA replication take place? \nA. Vacuole\nB. Cell membrane\nC*. Nucleus\nD. Ribosome";
            }

            else if (currentClass.equals("Physical Education")) {
                return "How many minutes should you play or exercise every day?\nA. 0\nB. 5\nC. 10\nD. 30";
            }

            else if (currentClass.equals("English 9") || currentClass.equals("English 10") || currentClass.equals("AP English Language")) {
                return "The woman, who has been missing for 10 days, is believed _____. \nA. to be abducted\nB. to be abducting\nC*. to have been abducted\nD. to have been abducting";
            }

            else if (currentClass.equals("Pre-AP World History") || currentClass.equals("AP World History")) {
                return "What is the Mandate of Heaven?\nA. A law the states only emperors will go to Heaven\nB. The Shinto temple\nC*. The ruler is divinely ordained\nD. The ruler is a god on Earth";
            }

            else if (currentClass.equals("Spanish I") || currentClass.equals("Spanish II") || currentClass.equals("Spanish III")) {
                return "What is the translation from English to Spanish for 'to have'?\nA. ser\nB. tengo\nC. hablar\nD*. tener";
            }

            else if (currentClass.equals("Algebra / Geometry")) {
                return "If 2x^2 = 32, what is the value of x?\nA. 2\nB*. 4\nC. 8\nD. 6";
            }

            else if (currentClass.equals("Lunch") || currentClass.equals("Gap Lunch")) {
                return "You have a short break for this period!";
            }

            else if (currentClass.equals("Freshman Advisory") || currentClass.equals("Sophomore Advisory")) {
                return "You have no work this whole period.";
            }

            else if (currentClass.equals("DDP (Design, Draft, Production)")) {
                return "You sat down and talked with your friends while drawing a road.";
            }

            else if (currentClass.equals("Living Environment Lab")) {
                return "Your teachers absent! You will do the virtual lab when you get home.";
            }

            else if (currentClass.equals("Algebra 2")) {
                return "A population is normally distributed with a mean of 23 and a standard\ndeviation of 1.2. The percentage of the population that falls below 21,\nto the nearest hundredth, is\nA. 0.05\nB*. 4.78\nC. 8.29\nD. 91.30";
            }

            else if (currentClass.equals("Chemistry")) {
                return "An element that is a very reactive metal could\nhave an atomic number of \nA. 9\nB. 2\nC*. 19\nD. 79";
            }

            else if (currentClass.equals("Chemistry Lab")) {
                return "Your teachers absent! You will do the virtual lab when you get home.";
            }

            else if (currentClass.equals("AP Computer Science Principles") || currentClass.equals("AP Computer Science A")) {
                return "Which one is a boolean?\nA. 2\nB*. true\nC. 'false'\nD. 6.4";
            }

            else if (currentClass.equals("AP US History")) {
                return "Which term from the 1920s is most closely\nassociated with Duke Ellington and Langston\nHughes?\nA*. Lost Generation\nB. Red Scare\nC. Teapot Dome scandal\nD. Harlem Renaissance";
            }

            else if (currentClass.equals("Pre-Calculus")) {
                return "The sum of the first 20 terms of the series 22 1 6 2 18 1 54 2 … is\nA. -610\nB*. -59\nC. 1,743,392,200\nD. 2,324,522,934";
            }

            else if (currentClass.equals("Physics")) {
                return "Which object is in equilibrium?\nA. Earth orbiting the Sun\nB. a thrown baseball at its highest point above the ground\nC*. a car moving at a constant speed in a straight line\nD. a bicycle skidding to a stop in a straight line";
            }

            else {

            }
        }

        else if (work.equals("Worksheet")) {

            if (currentClass.equals("Living Environment")) {
                return "Which statement describes an activity of a decomposer?\nA*. A mushroom digests and absorbs nutrients from organic matter.\nB. A sunflower uses nutrients from the soil to make proteins.\nC. A snail scrapes algae off rocks in an aquarium.\nD. A hawk eats and digests a mouse.";
            }

            else if (currentClass.equals("Physical Education")) {
                return "Which of the following techniques would be most effective in helping a student increase the height of a vertical jump?\nA. kicking the legs while in the air\nB. swinging the arms overhead while in the air\nC. tucking the legs quickly after takeoff\nD*. extending the legs more quickly during takeoff";
            }

            else if (currentClass.equals("English 9") || currentClass.equals("English 10") || currentClass.equals("AP English Language")) {
                return "I understand that you've sent him an e-mail message. I think you ............... him instead.\nA*. ought to have phoned\nB. should phone\nC. couldn't have phoned\nD. had phoned";
            }

            else if (currentClass.equals("Pre-AP World History") || currentClass.equals("AP World History")) {
                return "Who was the first king to unite several cities under one ruler?\nA*. Sargon\nB. Darius\nC. Urak\nD. Hammurabi";
            }

            else if (currentClass.equals("Spanish I") || currentClass.equals("Spanish II") || currentClass.equals("Spanish III")) {
                return "Pablo es de estatura normal, delgado y calvo. Which of the following statements about Pablo is true?\nA*. He is bald.\nB. He is short.\nC. He has brown hair.\nD. He is fat.";
            }

            else if (currentClass.equals("Algebra / Geometry")) {
                return "What is the image of (4,3) after a reflection over the line y=1?\nA. (-2,3)\nB. (-4,3)\nC*. (4,-1)\nD. (4,-3)";
            }

            else if (currentClass.equals("Lunch") || currentClass.equals("Gap Lunch")) {
                return "You have a short break for this period!";
            }

            else if (currentClass.equals("Freshman Advisory") || currentClass.equals("Sophomore Advisory")) {
                return "How long is every period besides 3rd period at Brooklyn Technical High School?\nA. 40 minutes\nB. 43 minutes\nC*. 41 minutes\nD. 42 minutes";
            }

            else if (currentClass.equals("DDP (Design, Draft, Production)")) {
                return "You built a cool puzzle in class.";
            }

            else if (currentClass.equals("Living Environment Lab")) {
                return "How many legs does a frog have?\nA. 3\nB. 2\nC*. 4\nD. 5";
            }

            else if (currentClass.equals("Algebra 2")) {
                return "7 A retailer advertises that items will be discounted by 10% every\nMonday until they are sold. In how many weeks will an item costing\n$50 first be sold for under half price?\nA*. 7\nB. 6\nC. 5\nD. 4";
            }

            else if (currentClass.equals("Chemistry")) {
                return "Which atom forms an ion with a radius larger\nthan the atomic radius?\nA. calcium atom\nB*. oxygen atom\nC. lead atom\nD. tin atom";
            }

            else if (currentClass.equals("Chemistry Lab")) {
                return "What is the atomic number of argon?\nA. 13\nB. 12\nC*. 18\nD. 15";
            }

            else if (currentClass.equals("AP Computer Science Principles") || currentClass.equals("AP Computer Science A")) {
                return "Which one is an int?\nA. 2\nB*. true\nC. 'false'\nD. 6.4";
            }

            else if (currentClass.equals("AP US History")) {
                return "What was the major goal of the political reforms\nenacted during the Progressive Era (1900–1920)?\nA*. expanding citizen participation in government\nB. lowering the legal voting age\nC. discouraging the formation of new political\nparties\nD. providing public funding of campaigns";
            }

            else if (currentClass.equals("Pre-Calculus")) {
                return "The Hot and Tasty Coffee chain conducts a survey of its customers\nat its location at the Staten Island ferry terminal. After the survey is\ncompleted, the statistical consultant states that 70% of customers who\ntook the survey said the most important factor in choosing where to\nget their coffee is how fast they are served. Based on this result, Hot\nand Tasty Coffee can infer that\nA. most of its customers in New York State care most about being served quickly\nB*. coffee drinkers care less about taste and more about being served quickly\nC. most of its customers at the Staten Island ferry terminal care most about being served quickly\nD. most of its customers at transportation terminals and stations care\nmost about being served quickly";
            }

            else if (currentClass.equals("Physics")) {
                return "Which object is in equilibrium?\nA. Earth orbiting the Sun\nB. a thrown baseball at its highest point above the ground\nC*. a car moving at a constant speed in a straight line\nD. a bicycle skidding to a stop in a straight line";
            }

            else {

            }
        }

        else {

            if (currentClass.equals("Living Environment")) {
                return "Plant cells can synthesize energy-rich organic molecules, and later break them down to extract that energy for performing life processes. These activities require direct interaction between the \nA. Chloroplasts and vacuoles\nB. Cell walls and ribosomes\nC*. \nChloroplasts and mitochondria\nD. Ribosomes and mitochondria";
            }

            else if (currentClass.equals("Physical Education")) {
                return "Recreational group and team games such as horseshoes, ultimate, and volleyball are especially well suited to providing social benefits to participants primarily because they: \nA. keep participants of all fitness levels equally challenged.\nB. require participants to take turns self-officiating.\nC*. promote enjoyment and camaraderie among participants with similar interests.\nD. involve competition and scoring, thus generating comments and discussions among participants.";
            }

            else if (currentClass.equals("English 9") || currentClass.equals("English 10") || currentClass.equals("AP English Language")) {
                return "I promise that I will be here when you come back, but I'm afraid everyone else .............. by then.\nA. were leaving\nB. leave\n C. are leaving\nD*. will have left";
            }

            else if (currentClass.equals("Pre-AP World History") || currentClass.equals("AP World History")) {
                return "“History is filled with the sound of silken slippers going downstairs and wooden shoes coming up.\nQuote attributed to Voltaire, French Enlightenment writer, historian, and philosopher, circa 1740\nA proponent of the idea presented in the excerpt—that history is full of cycles in which the elite are overthrown by an underclass that subsequently become the new elite—would most likely use which of the following as an example?\nA. The sack of Constantinople in 1204\nB. The rise of the Ghanaian Empire\nC*. The Chinese Red Turban Rebellion\nD. The split of the Romans and Byzantines";
            }

            else if (currentClass.equals("Spanish I") || currentClass.equals("Spanish II") || currentClass.equals("Spanish III")) {
                return "Choose the correct translation: Nieva seguido en invierno.\nA. She is afraid to lose everything\nB*. It often snows in the winter\nC. He is the son of a very important man\nD. We walked to the ocean yesterday";
            }

            else if (currentClass.equals("Algebra / Geometry")) {
                return "Which regular polygon would carry onto itself after a rotation of 300° about its center?\nA. decagon\nB. nonagon\nC. octagon\nD*. hexagon";
            }

            else if (currentClass.equals("Lunch") || currentClass.equals("Gap Lunch")) {
                return "You have a short break for this period!";
            }

            else if (currentClass.equals("Freshman Advisory") || currentClass.equals("Sophomore Advisory")) {
                return "What room is Mr.Newman's office?\nA. 1W12\nB. 1W10\nC*. 1W18\nD. 7S5";
            }

            else if (currentClass.equals("DDP (Design, Draft, Production)")) {
                return "What does DDP stand for?\nA. Draw, Draft, Practice\nB. Design, Draft, Practice\nC*. Design, Draft, Production\nD. Draw, Draft, Practice";
            }

            else if (currentClass.equals("Living Environment Lab")) {
                return "Is a sheep a mammal?\nA. No\nB. Maybe\nC*. Yes\nD. Probably";
            }

            else if (currentClass.equals("Algebra 2")) {
                return "A group of high school students wanted to collect information on how\nmany times per week students exercised. If they want the least biased\nresults they should survey every fifth student at the school who is\nA. entering the gym\nB. in the junior class \nC. entering the library\nD*. entering the building";
            }

            else if (currentClass.equals("Chemistry")) {
                return "A reaction is most likely to occur when the\nreacting particles collide with proper orientation\nand proper\nA. charge\nB*. energy\nC. mass\nD. volume";
            }

            else if (currentClass.equals("Chemistry Lab")) {
                return "What is the electronegativity of rhodium?\nA. 2.0\nB. 2.1\nC*. 2.3\nD. 4.0";
            }

            else if (currentClass.equals("AP Computer Science Principles") || currentClass.equals("AP Computer Science A")) {
                return "Which one is a double?\nA. 2\nB*. true\nC. 'false'\nD. 6.4";
            }

            else if (currentClass.equals("AP US History")) {
                return "The establishment of judicial review in Marbury\nv. Madison (1803) gave the Supreme Court the\nauthority to\nA. impeach members of Congress\nB. create state courts\nC. approve foreign treaties\nD*. decide the constitutionality of a law";
            }

            else if (currentClass.equals("Pre-Calculus")) {
                return "The Hot and Tasty Coffee chain conducts a survey of its customers\nat its location at the Staten Island ferry terminal. After the survey is\ncompleted, the statistical consultant states that 70% of customers who\ntook the survey said the most important factor in choosing where to\nget their coffee is how fast they are served. Based on this result, Hot\nand Tasty Coffee can infer that\nA. most of its customers in New York State care most about being served quickly\nB*. coffee drinkers care less about taste and more about being served quickly\nC. most of its customers at the Staten Island ferry terminal care most about being served quickly\nD. most of its customers at transportation terminals and stations care\nmost about being served quickly";
            }

            else if (currentClass.equals("Physics")) {
                return "Which object is in equilibrium?\nA. Earth orbiting the Sun\nB. a thrown baseball at its highest point above the ground\nC*. a car moving at a constant speed in a straight line\nD. a bicycle skidding to a stop in a straight line";
            }

            else {
                return "What is the acceleration due to gravity on earth?\nA. -10m/s^2\nB. 10m/s^2\nC*. 9.81m/s^2\nD. 9m/s^2";
            }
        }
        return "";
    }

    /**
     * The getWork method simply returns the form of work currently being given.
     * @return returns a String of the form of work being given
     */
    public String getWork() {
        return work;
    }

    /**
     * The checkAnswer method checks whether an answer is correct or not.
     * @param correctAnswer represents the correct answers to the question
     * @param answer represents the answer the user inputs
     * @return returns a boolean true if the answer is correct and a boolean false if the answer is wrong
     */
    public boolean checkAnswer(String correctAnswer, String answer) {
        if (answer.equals(correctAnswer)) {
            return true;
        }

        else {
            return false;
        }
    }
}
