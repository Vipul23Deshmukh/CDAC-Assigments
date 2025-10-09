import java.sql.Date;

public class Test {
    private int testId;
    private String testName;
    private Date testDate;
    private Question[] questions;

    public Test(int testId, String testName, Date testDate, Question[] questions)
    {
        this.testId = testId;
        this.testName = testName;
        this.testDate = testDate;
        this.questions = questions;
    }

    public void displayTest() {
        System.out.println("Test ID: " + testId);
        System.out.println("Test Name: " + testName);
        System.out.println("Test Date: " + testDate);
        System.out.println("Questions:");
        for (Question q : questions) {
            System.out.println(q);
        }
    }
}



