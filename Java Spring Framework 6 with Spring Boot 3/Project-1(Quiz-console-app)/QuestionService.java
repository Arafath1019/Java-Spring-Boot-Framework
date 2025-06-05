
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selections = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "What is 2 + 2?", "3", "4", "5", "6", "4");
        questions[2] = new Question(3, "What is the largest planet in our solar system?", "Earth", "Mars", "Jupiter", "Saturn", "Jupiter");
        questions[3] = new Question(4, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
        questions[4] = new Question(5, "What is the boiling point of water?", "90°C", "100°C", "110°C", "120°C", "100°C");
    }

    public void playQuiz() {
        int index = 0;
        for (Question q : questions) {
            System.out.println(q.getId() + ". " + q.getQuestion());
            System.out.print("Options: ");
            System.out.print("1. " + q.getOpt1() + " ");
            System.out.print("2. " + q.getOpt2() + " ");
            System.out.print("3. " + q.getOpt3() + " ");
            System.out.print("4. " + q.getOpt4() + " ");
            System.out.println();
            System.out.println("Enter your answer (1-4): ");
            Scanner scanner = new Scanner(System.in);
            selections[index] = scanner.nextLine();
            index++;
        }

        System.out.println("Your selections: ");
        for (String selection : selections) {
            System.out.print(selection + " ");
        }
    }

    int score = 0;

    public void printScore() {
        for (int i = 0; i < questions.length; i++) {
            if (getOptionValue(questions[i], selections[i]).equals(questions[i].getAnswer())) {
                score++;
            }
        }
        System.out.println("\nYour score is: " + score + " out of " + questions.length);
    }

    private String getOptionValue(Question q, String opt) {
        switch (opt) {
            case "1":
                return q.getOpt1();
            case "2":
                return q.getOpt2();
            case "3":
                return q.getOpt3();
            case "4":
                return q.getOpt4();
            default:
                return "";
        }
    }
}
