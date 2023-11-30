import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class UserRegisterTest {
    @Test
    public void testFirstName(){
        User user = new User();
        user.addFirstName("Vaisakh");
        String firstName = user.firstName;
        assertEquals("Vaisakh", firstName);
        User user2 = new User();
        user2.addFirstName("vaisakh");
        String firstName2 = user2.firstName;
        assertNotEquals("vaisakh", firstName2);
    }

    @Test
    public void testLastName(){
        User user = new User();
        user.addLastName("Krishnan");
        String lastName = user.lastName;
        assertEquals("Krishnan", lastName);
        User user2 = new User();
        user2.addLastName("vaisakh");
        String lastName2 = user2.lastName;
        assertNotEquals("vaisakh", lastName2);
    }

    @Test
    public void testUserEmail(){
        User user = new User();
        User user2 = new User();
        user.matchEmail("abc-100@yahoo.com");
        String userEmail = user.userEmail;
        assertEquals("abc-100@yahoo.com", userEmail);
        user2.matchEmail("abc");
        String userEmail2 = user2.userEmail;
        assertNotEquals("abc", user2);

    }

    @Test
    public void testPassword(){
        User user = new User();
        User user2 = new User();
        user.checkPassword("A#7qtgdj3dd");
        String password = user.password;
        assertEquals("A#7qtgdj3dd", password);
        user2.checkPassword("A7qtgdj3dd");
        password = user2.password;
        assertNotEquals("A7qtgdj3dd", password);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"})
    void testEmail(String userEmail){
        User user = new User();
        user.matchEmail(userEmail);
        assertEquals(userEmail, userEmail);
    }

}
