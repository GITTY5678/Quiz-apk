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

        //Select the total number of questions to be asked
        System.out.println("How many questions do you want to answer? (Max: " + loadedQuestions.size() + ")");
        int totalQuestions = scan.nextInt();
        if (totalQuestions > loadedQuestions.size()) {
            System.out.println("You can only answer up to " + loadedQuestions.size() + " questions.");
            totalQuestions = loadedQuestions.size();
            }
        // filter the questions based on the total number selected and mode of difficulty
        System.out.println("Select difficulty level: Easy, Medium, Hard");
        String difficulty = scan.nextLine().toUpperCase();
        List<Question> filteredQuestions = new ArrayList<>();
        for (int i = 0; i < totalQuestions; i++) {
            if ((i < loadedQuestions.size()) && (loadedQuestions.get(i).difficulty.equalsIgnoreCase(difficulty))) {
                filteredQuestions.add(loadedQuestions.get(i));
            } else {
                System.out.println("Not enough questions available.");
                break;
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
        updateplayerscore updater = new updateplayerscore();
        updater.updateplayerscore(user_name, score, timeTaken);
        updater.update(); // Call the update method to save the score
        scan.close(); // Close the scanner to prevent resource leak
    }

}


