import java.util.*;
public class Questionbank {
    List<Question> questions= new ArrayList<>();
    
    public void addquestion(Question q){
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
