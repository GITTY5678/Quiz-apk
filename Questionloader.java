import java.io.*;
import java.util.*;

public class Questionloader {
    public static List<Question> loadquestions(String filename){
        List<Question> questions =  new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
            String line;
            while((line=br.readLine())!=null){
                String question=line;
                String[] options=new String[4];
                for(int i=0;i<4;i++){
                    options[i]=br.readLine();
                }
                int correctanswer=Integer.parseInt(br.readLine());
                questions.add(new Question(question, options, correctanswer));
                
            }
        }
        catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        return questions;
    }}
    
    

