import java.sql.Date;

public class TestService {
    public static void main(String[] args) {
        Question[] questions = new Question[10];

        for (int i = 0; i < 10; i++) {
            questions[i] = new Question(
                i + 1,
                "What is " + (i + 1) + " + " + (i + 2) + "?",
                "Option A", "Option B", "Option C", "Option D",
                1, // correct answer
                5  // marks
            );
        }

        Date testDate = new Date(System.currentTimeMillis());
        Test test = new Test(101, "Math Test", testDate, questions);

        test.displayTest();
    }
}
