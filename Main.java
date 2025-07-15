import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Questionloader questionloader = new Questionloader();
        // display dis =new display(); // No longer needed directly as Question class handles its own display
        //Questionbank questionbank = new Questionbank(); // Commented out as it's not used in Main
        Admin admin = new Admin("Hariharasuthan"); 
        admin.ShowInfo(); //
        System.out.println("Enter user name:");
        String user_name= scan.nextLine();
        PLAYER player = new PLAYER(user_name); //
        player.ShowInfo(); //


        int score = 0;
        // Load questions once and shuffle the loaded list
        List<Question> loadedQuestions = questionloader.loadquestions("questions.txt"); //
        Collections.shuffle(loadedQuestions);// [cite_start]// [cite: 1]

        for (Question question: loadedQuestions) { // Iterate over the shuffled list
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
        System.out.println("\nQuiz finished! Your score: " + score + "/" + loadedQuestions.size());
        scan.close(); // Close the scanner to prevent resource leak
    }

}