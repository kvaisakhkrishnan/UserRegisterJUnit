import java.util.*;
public class Driver {
    public static void main(String[] args){
        User user = new User();
        System.out.println("Enter First Name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        try{
            user.addFirstName(firstName);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        try{
            user.addLastName(lastName);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }

        System.out.println("Enter Useremail: ");
        String useremail = scanner.next();
        try{
            user.matchEmail(useremail);
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println("Enter Phonenumber: ");
        String phonenumber = scanner.next();
        try{
            user.matchPhone(phonenumber);
        }catch(Exception err){
            System.out.println(err.getMessage());
        }
        System.out.println("Enter Password: ");
        String password = scanner.next();
        try{
            user.checkPassword(password);
        }catch(Exception err){
            System.out.println(err.getMessage());
        }

    }
}
