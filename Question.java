public class Question {
    String question;
    String[] options;
    int correctAnswer;
    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
    public void display(){
        System.out.println("Question"+ question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }
    public boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }
}

