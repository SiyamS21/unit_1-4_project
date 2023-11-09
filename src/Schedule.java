public class Schedule {
    private String dayOnePeriodOne, dayOnePeriodTwo, dayOnePeriodThree, dayOnePeriodFour, dayOnePeriodFive, dayOnePeriodSix, dayOnePeriodSeven, dayOnePeriodEight, dayOnePeriodNine;
    private String dayTwoPeriodOne, dayTwoPeriodTwo, dayTwoPeriodThree, dayTwoPeriodFour, dayTwoPeriodFive, dayTwoPeriodSix, dayTwoPeriodSeven, dayTwoPeriodEight, dayTwoPeriodNine;
    private String dayThreePeriodOne, dayThreePeriodTwo, dayThreePeriodThree, dayThreePeriodFour, dayThreePeriodFive, dayThreePeriodSix, dayThreePeriodSeven, dayThreePeriodEight, dayThreePeriodNine;
    private String dayFourPeriodOne, dayFourPeriodTwo, dayFourPeriodThree, dayFourPeriodFour, dayFourPeriodFive, dayFourPeriodSix, dayFourPeriodSeven, dayFourPeriodEight, dayFourPeriodNine;
    private String dayFivePeriodOne, dayFivePeriodTwo, dayFivePeriodThree, dayFivePeriodFour, dayFivePeriodFive, dayFivePeriodSix, dayFivePeriodSeven, dayFivePeriodEight, dayFivePeriodNine;
    private String daySixPeriodOne, daySixPeriodTwo, daySixPeriodThree, daySixPeriodFour, daySixPeriodFive, daySixPeriodSix, daySixPeriodSeven, daySixPeriodEight, daySixPeriodNine;
    private String daySevenPeriodOne, daySevenPeriodTwo, daySevenPeriodThree, daySevenPeriodFour, daySevenPeriodFive, daySevenPeriodSix, daySevenPeriodSeven, daySevenPeriodEight, daySevenPeriodNine;
    private String dayEightPeriodOne, dayEightPeriodTwo, dayEightPeriodThree, dayEightPeriodFour, dayEightPeriodFive, dayEightPeriodSix, dayEightPeriodSeven, dayEightPeriodEight, dayEightPeriodNine;
    private String dayNinePeriodOne, dayNinePeriodTwo, dayNinePeriodThree, dayNinePeriodFour, dayNinePeriodFive, dayNinePeriodSix, dayNinePeriodSeven, dayNinePeriodEight, dayNinePeriodNine;
    private String dayTenPeriodOne, dayTenPeriodTwo, dayTenPeriodThree, dayTenPeriodFour, dayTenPeriodFive, dayTenPeriodSix, dayTenPeriodSeven, dayTenPeriodEight, dayTenPeriodNine;

    public Schedule(int grade) {
        if (grade == 9) {
            dayOnePeriodOne= "Living Environment";
            dayTwoPeriodOne= "Living Environment";
            dayThreePeriodOne= "Living Environment";
            dayFourPeriodOne= "Living Environment";
            dayFivePeriodOne= "Living Environment";
            daySixPeriodOne= "Living Environment";
            daySevenPeriodOne= "Living Environment";
            dayEightPeriodOne= "Living Environment";
            dayNinePeriodOne= "Living Environment";
            dayTenPeriodOne= "Living Environment";
            dayOnePeriodTwo= "Living Environment";
            dayTwoPeriodTwo= "Living Environment";
            dayThreePeriodTwo= "Living Environment";
            dayFourPeriodTwo= "Living Environment";
            dayFivePeriodTwo= "Living Environment";
            daySixPeriodTwo= "Living Environment";
            daySevenPeriodTwo= "Living Environment";
            dayEightPeriodTwo= "Living Environment";
            dayNinePeriodTwo= "Living Environment";
            dayTenPeriodTwo= "Living Environment";

        }
        else if (grade == 10) {
            dayOnePeriodOne= "Spanish II";
            dayTwoPeriodOne= "Spanish II";
            dayThreePeriodOne= "Spanish II";
            dayFourPeriodOne= "Spanish II";
            dayFivePeriodOne= "Spanish II";
            daySixPeriodOne= "Spanish II";
            daySevenPeriodOne= "Spanish II";
            dayEightPeriodOne= "Spanish II";
            dayNinePeriodOne= "Spanish II";
            dayTenPeriodOne= "Spanish II";
        }
        else if (grade == 11) {
            dayOnePeriodOne= "AP US History";
            dayTwoPeriodOne= "AP US History";
            dayThreePeriodOne= "AP US History";
            dayFourPeriodOne= "AP US History";
            dayFivePeriodOne= "AP US History";
            daySixPeriodOne= "AP US History";
            daySevenPeriodOne= "AP US History";
            dayEightPeriodOne= "AP US History";
            dayNinePeriodOne= "AP US History";
            dayTenPeriodOne= "AP US History";
        }
    }
}
