import java.util.regex.*;
public class User {
    String firstName;
    String lastName;
    String userEmail;
    String phoneNumber;
    String password;
    public void addFirstName(String firstName) throws InvalidUserDetails {
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
        Matcher match = pattern.matcher(firstName);
        if(match.matches()) {
            System.out.println("Valid First Name");
            this.firstName = firstName;
        }
        else {
            throw new InvalidUserDetails("Invalid First Name");
        }
    }
    public void addLastName(String lastName) throws InvalidUserDetails{
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
        Matcher match = pattern.matcher(lastName);
        if(match.matches()) {
            System.out.println("Valid Last Name");
            this.lastName = lastName;
        }
        else {
            throw new InvalidUserDetails("Invalid Last Name");
        }
    }
    public void matchEmail(String email) throws InvalidUserDetails{
        Pattern pattern = Pattern.compile("[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-]+)*@[A-Za-z0-9]+(\\.[a-zA-Z]{2,}){1,2}");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            System.out.println("Valid Email");
            this.userEmail = email;
        }
        else {
            throw new InvalidUserDetails("Invalid Email");        }
    }
    public void matchPhone(String phoneNumber) throws InvalidUserDetails {
        Pattern pattern = Pattern.compile("[0-9]{2}\\s+[0-9]{10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()) {
            System.out.println("Valid Phone");
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new InvalidUserDetails("Invalid Phone");
        }
    }
    public void checkPassword(String password) throws InvalidUserDetails {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*\\d)(?=.*[@#.*^%=+])[a-zA-Z0-9@#.*^%=+]{8,}");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) {
            System.out.println("Valid Password");
            this.password = password;
        }
        else {
            throw new InvalidUserDetails("Invalid Password");
        }
    }
}
