
import java.util.Scanner;


public class View {
    public void createCustomer(){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("-----Register--------");
        System.out.println("input your information to register");
        System.out.println("Firstname: ");
        String fistName = sc.nextLine();
        System.out.println("Lastname: ");
        String lastName = sc.nextLine();
        System.out.println("E-mail: ");
        String email = sc.nextLine();
    }
}
