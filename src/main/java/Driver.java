import java.util.*;
public class Driver {
    public static void main(String[] args){
        User user = new User();
        System.out.println("Enter First Name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        user.addFirstName(firstName);
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        user.addLastName(lastName);
        System.out.println("Enter Useremail: ");
        String useremail = scanner.next();
        user.matchEmail(useremail);
        System.out.println("Enter Phonenumber: ");
        String phonenumber = scanner.next();
        user.matchPhone(phonenumber);
        System.out.println("Enter Password: ");
        String password = scanner.next();
        user.checkPassword(password);

    }
}
