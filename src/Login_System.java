import java.util.Scanner;

public class Login_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter Username");
            String Username = sc.next();
            System.out.println("Enter Password");
            String Password = sc.next();

            if (Password.equals("Simple123@") && Username.equals("Simple_234")) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Incorrect");
                System.out.println("Your Remaining Tries Are: " + (3 - i));
            }

        }
    }
}
