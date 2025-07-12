public class Admin  extends User {
    public Admin(String username) {
        super(username);
    }
    public void ShowInfo() {
        System.out.println("Admin Username: " + username);
    }
    public void addQuestion(Questionbank questionbank, Question question) {
        questionbank.addquestion(question);
    }
}
