import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Questionloader questionloader = new Questionloader();
        Admin admin = new Admin("Hariharasuthan"); 
        admin.ShowInfo(); //
        System.out.println("Enter user name:");
        String user_name= scan.nextLine();
        PLAYER player = new PLAYER(user_name); //
        player.ShowInfo(); //


        int score = 0;
        
        // Load questions once and shuffle the loaded list
        List<Question> loadedQuestions = questionloader.loadquestions("questions.txt"); //
        
        // [cite_start]// [cite: 1]
        System.out.println("Choose the difficulty level: EASY, MEDIUM, HARD");
        String difficulty = scan.nextLine().toUpperCase(); // Read difficulty level from user input
        //filter questions based on difficulty
        List<Question> filteredQuestions = new ArrayList<>();
        for (Question q : loadedQuestions) {
            if (q.difficulty.equalsIgnoreCase("EASY")) { // Check if the question's difficulty matches
                filteredQuestions.add(q);
            }
        }
        Collections.shuffle(filteredQuestions);
        long startTime = System.currentTimeMillis(); // Start the timer

        for (Question question: filteredQuestions) { // Iterate over the shuffled list
            question.display(); // Use the Question object's own display method

            System.out.println("Enter your answer (1-" + "4" + "): ");
            int answer = scan.nextInt();
            if(question.checkAnswer(answer)){ //
                score++;
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer! The correct answer was: " + question.options[question.correctAnswer - 1]);
            }
        }
        long endTime = System.currentTimeMillis(); // End the timer
        long timeTaken = (endTime - startTime); // Calculate the time taken in milliseconds
        System.out.println("\nQuiz finished! Your score: " + score + " out of " + filteredQuestions.size());
        System.out.println("Time taken: " + timeTaken/1000 + " seconds");
        scan.close(); // Close the scanner to prevent resource leak
    }

}


