import java.util.regex.*;
public class User {
    String firstName;
    String lastName;
    String userEmail;
    String phoneNumber;
    String password;
    public void addFirstName(String firstName) {
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
        Matcher match = pattern.matcher(firstName);
        if(match.matches()) {
            System.out.println("Valid First Name");
            this.firstName = firstName;
        }
        else {
            System.out.println("Invalid First Name");
        }
    }
    public void addLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z][a-zA-Z]{2,}");
        Matcher match = pattern.matcher(lastName);
        if(match.matches()) {
            System.out.println("Valid Last Name");
            this.lastName = lastName;
        }
        else {
            System.out.println("Invalid Last Name");
        }
    }
    public void matchEmail(String email) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9_\\-]+)(\\.[a-zA-Z0-9_\\-]+)*@([a-zA-Z]+)(\\.[a-zA-Z]{2,})");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            System.out.println("Valid Email");
            this.userEmail = email;
        }
        else {
            System.out.println("Invalid Email");
        }
    }
    public void matchPhone(String phoneNumber) {
        Pattern pattern = Pattern.compile("[0-9]{2}\\s[0-9]{10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()) {
            System.out.println("Valid Phone");
            this.phoneNumber = phoneNumber;
        }
        else {
            System.out.println("Invalid Phone");
        }
    }
    public void checkPassword(String password) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*\\d)(?=.*[@#.*^%=+])[a-zA-Z0-9@#.*^%=+]{8,}");
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) {
            System.out.println("Valid Password");
            this.password = password;
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}
