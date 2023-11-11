import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordStrengthTest
{
    @Test
    public void testCalculateWeakPasswordStrength() {
        assertEquals(5, PasswordStrength.calculatePasswordStrength("password")); //weak
    }

    @Test
    public void testCalculateModeratePasswordStrength() {
        assertEquals(25, PasswordStrength.calculatePasswordStrength("p@ssword")); //medium
    }

    @Test
    public void testCalculateStrongPasswordStrength() {
        assertEquals(45, PasswordStrength.calculatePasswordStrength("S0m3V3ry$trongP@ss")); //strong
    }

}
