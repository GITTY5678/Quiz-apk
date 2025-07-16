import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Questionloader questionloader = new Questionloader();
        Admin admin = new Admin("Hariharasuthan");
        admin.ShowInfo();
        System.out.println("Enter user name:");
        String user_name= scan.nextLine();
        PLAYER player = new PLAYER(user_name);
        player.ShowInfo();

        boolean start= true;
        while (start){
        //MENU
        System.out.println("Choose an option:");
        System.out.println("1. Start Quiz");
        System.out.println("2.Exit");
        int choice = scan.nextInt();

        switch(choice){
        case 1:
            int score = 0;
            List<Question> loadedQuestions = questionloader.loadquestions("questions.txt");

            System.out.println("Select difficulty level: Easy, Medium, Hard");
            scan.nextLine(); // consume leftover newline after nextInt
            String selectedDifficulty = scan.nextLine().trim().toUpperCase();

            // Filter questions by difficulty first
            List<Question> questionsByDifficulty = new ArrayList<>();
            for (Question q : loadedQuestions) {
                if (q.difficulty.equalsIgnoreCase(selectedDifficulty)) {
                    questionsByDifficulty.add(q);
                }
            }

            // Check if there are any questions for the selected difficulty
            if (questionsByDifficulty.isEmpty()) {
                System.out.println("No questions available for the selected difficulty level.");
                break; // Go back to the main menu
            }

            // Select the total number of questions to be asked
            System.out.println("How many questions do you want to answer? (Max: " + questionsByDifficulty.size() + ")");
            int totalQuestions = scan.nextInt();

            if (totalQuestions > questionsByDifficulty.size()) {
                System.out.println("You can only answer up to " + questionsByDifficulty.size() + " questions for " + selectedDifficulty + " difficulty.");
                totalQuestions = questionsByDifficulty.size();
            }

            // Create the final list of questions for the quiz
            List<Question> quizQuestions = new ArrayList<>(questionsByDifficulty.subList(0, totalQuestions));
            Collections.shuffle(quizQuestions);

            long startTime = System.currentTimeMillis();

            for (Question question: quizQuestions) {
                question.display();

                System.out.println("Enter your answer (1-" + "4" + "): ");
                int answer = scan.nextInt();
                if(question.checkAnswer(answer)){
                    score++;
                    System.out.println("Correct Answer!");
                } else {
                    System.out.println("Wrong Answer! The correct answer was: " + question.options[question.correctAnswer - 1]);
                }
            }
            long endTime = System.currentTimeMillis();
            long timeTaken = (endTime - startTime);
            System.out.println("\nQuiz finished! Your score: " + score + " out of " + quizQuestions.size());
            System.out.println("Time taken: " + timeTaken/1000 + " seconds");
            updateplayerscore updater = new updateplayerscore();
            updater.updateplayerscore(user_name, score, timeTaken);
            updater.update();
            break;
        case 2:
            System.out.println("Exiting the quiz. Thank you for playing!");
            start = false;
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
    }

}}}