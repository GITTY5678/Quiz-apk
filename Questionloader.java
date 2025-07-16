import java.io.*;
import java.util.*;

public class Questionloader {
    public static List<Question> loadquestions(String filename){
        List<Question> questions =  new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = br.readLine()) != null){
                // *** IMPORTANT FIX: Skip empty lines ***
                if (line.trim().isEmpty()) {
                    continue;
                }

                String questionText = line;
                String[] options = new String[4];
                for(int i = 0; i < 4; i++){
                    String optionLine = br.readLine();
                    if (optionLine == null) {
                        System.err.println("Error: Unexpected end of file while reading option " + (i + 1) + " for question: " + questionText);
                        return questions; // Or throw an exception
                    }
                    options[i] = optionLine;
                }

                // Read correct answer line and trim it
                String correctAnswerLine = br.readLine();
                if (correctAnswerLine == null) {
                    System.err.println("Error: Unexpected end of file while reading correct answer for question: " + questionText);
                    return questions; // Or throw an exception
                }
                int correctanswer = Integer.parseInt(correctAnswerLine.trim()); // Use .trim() to remove whitespace

                // Read difficulty line and trim it
                String difficultyLine = br.readLine();
                if (difficultyLine == null) {
                    System.err.println("Error: Unexpected end of file while reading difficulty for question: " + questionText);
                    return questions; // Or throw an exception
                }
                String difficulty = difficultyLine.trim(); // Use .trim() to remove whitespace
                if( difficulty.isEmpty()) {
                    System.err.println("Error: Difficulty line is empty for question: " + questionText);
                    continue; // Skip this question if difficulty is empty
                }
                
                questions.add(new Question(questionText, options, correctanswer, difficulty));
            }
        }
        catch(IOException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
        catch(NumberFormatException e){
            // This catch block will now be more likely to catch issues with actual non-numeric data
            // rather than just empty strings, if the .trim().isEmpty() check is effective.
            System.err.println("Error parsing number (likely correct answer or difficulty): " + e.getMessage() + ". Check your Questions.txt format for non-numeric data where numbers are expected.");
        }
        return questions;
    }
}
    

