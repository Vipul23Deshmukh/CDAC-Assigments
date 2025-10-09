public class Question {
    private int questionNumber;
    private String questionText;
    private String optionA, optionB, optionC, optionD;
    private int correctAnswer; // 1 to 4
    private int marks;

    public Question(int questionNumber, String questionText, String optionA, String optionB,
                    String optionC, String optionD, int correctAnswer, int marks) {
        this.questionNumber = questionNumber;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Q" + questionNumber + ": " + questionText + "\n" +
               "1) " + optionA + "\n" +
               "2) " + optionB + "\n" +
               "3) " + optionC + "\n" +
               "4) " + optionD + "\n" +
               "Correct Answer: " + correctAnswer + ", Marks: " + marks + "\n";
    }
}
