import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Questionbank questionbank = new Questionbank();
        Admin admin = new Admin("Hariharasuthan");
        admin.ShowInfo();
        System.out.println("Enter user name:");
        String user_name= scan.nextLine();
        
    }
}
