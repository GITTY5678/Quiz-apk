import java.util.*;
import java.io.*;
public class Question {
    String question;
    String[] options;
    int correctAnswer;
    String difficulty;
    public Question(String question, String[] options, int correctAnswer,String difficulty) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.difficulty = difficulty; // Store the difficulty level

    }
    public void display(){
        System.out.println("Question:"+ question+ " (Difficulty: " + difficulty + ")");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
    public boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }
}

