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
    }

    @Test
    public void testFailFirstName(){
        User user2 = new User();
        user2.addFirstName("vaisakh");
        String firstName2 = user2.firstName;
        assertEquals("vaisakh", firstName2);
    }

    @Test
    public void testLastName(){
        User user = new User();
        user.addLastName("Krishnan");
        String lastName = user.lastName;
        assertEquals("Krishnan", lastName);

    }

    @Test
    public void testFailLastName(){
        User user2 = new User();
        user2.addLastName("vaisakh");
        String lastName2 = user2.lastName;
        assertEquals("vaisakh", lastName2);
    }

    @Test
    public void testUserEmail(){
        User user = new User();
        user.matchEmail("abc-100@yahoo.com");
        String userEmail = user.userEmail;
        assertEquals("abc-100@yahoo.com", userEmail);
    }


    @Test
    public void testFailUserEmail(){
        User user2 = new User();
        user2.matchEmail("abc");
        String userEmail2 = user2.userEmail;
        assertEquals("abc", user2);
    }

    @Test
    public void testPassword(){
        User user = new User();
        user.checkPassword("A#7qtgdj3dd");
        String password = user.password;
        assertEquals("A#7qtgdj3dd", password);
    }

    @Test
    public void testFailPassword(){
        User user2 = new User();
        String password = user2.password;
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


    @ParameterizedTest
    @ValueSource(strings = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", ".abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com"})
    void testFalseEmail(String userEmail){
        User user = new User();
        user.matchEmail(userEmail);
        assertEquals(userEmail, userEmail);
    }



}
