import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
    @Test
    public void testValidPassword() {
        assertTrue(Main.validatePassword("Test1@bc"));
    }

    @Test
    public void testPasswordTooShort() {
        assertFalse(Main.validatePassword("T1@b"));
    }

    @Test
    public void testPasswordTooLong() {
        assertFalse(Main.validatePassword("Test1@bcdef"));
    }

    @Test
    public void testPasswordMissingUppercase() {
        assertFalse(Main.validatePassword("test1@bc"));
    }

    @Test
    public void testPasswordMissingLowercase() {
        assertFalse(Main.validatePassword("TEST1@BC"));
    }

    @Test
    public void testPasswordMissingDigit() {
        assertFalse(Main.validatePassword("Test@bc"));
    }

    @Test
    public void testPasswordMissingSpecialCharacter() {
        assertFalse(Main.validatePassword("Test1abc"));
    }

    @Test
    public void testPasswordWithWhitespaceAtStart() {
        assertFalse(Main.validatePassword(" Test1@bc"));
    }

    @Test
    public void testPasswordWithWhitespaceAtEnd() {
        assertFalse(Main.validatePassword("Test1@bc "));
    }

    @Test
    public void testPasswordWithWhitespaceInMiddle() {
        assertFalse(Main.validatePassword("Test1 @bc"));
    }
}
