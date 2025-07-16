//importing necessary packages
import java.util.*;
import java.io.*;
// This class is intended to update the player's score after the quiz
// It will be used to save the score to a file or database in the future
public class updateplayerscore {
    String playerName;
    int score;
    long timeTaken;
    public void updateplayerscore(String playerName, int score, long timeTaken) {
        this.playerName = playerName;
        this.score = score;
        this.timeTaken = timeTaken;
    }
        // Here you can implement the logic to save the score to a file or database
        // For now, we will just print the details
        public void update(){
        try(FileWriter writer = new FileWriter("scores.txt",true)){
            writer.write("Player: " + playerName + ", Score: " + score + ", Time Taken: " + timeTaken + " ms\n");
            System.out.println("Score updated successfully for player: " + playerName);
        } catch (IOException e) {
            System.out.println("An error occurred while updating the score.");
            e.printStackTrace();
        }
    }
    }

