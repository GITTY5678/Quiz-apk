import java.util.*;
import java.io.*;

public class Difficulty {
    String difficultyLevel;
    public Difficulty(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    
    public static boolean isvaliddifficulty(String filename, String difficulty){
        List<Question> questions = Questionloader.loadquestions(filename);
        for (Question question : questions) {
            if (question.difficulty.equalsIgnoreCase(difficulty)) {
                return true; // Found at least one question with the specified difficulty
            }
        }
        return false; // No questions found with the specified difficulty
    }
}
