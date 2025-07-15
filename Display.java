import java.io.*;
import java.util.*;


public class Display {
    String question;
    String options[];
    
    public Display(String question, String[] options) {
        this.question = question;
        this.options = options;
    }
    public void display_question(){
        System.out.println("Question: " + this.question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
}
