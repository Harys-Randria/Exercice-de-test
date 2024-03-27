/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import mg.inclusiv.cdan008.Entity.Calculatrice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Inclusiv Academy 009
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void testAddition() {
        assertEquals(3, Calculatrice.Addition(1, 2));
        assertEquals(-13, Calculatrice.Addition(-8, -5));
        assertEquals(-10, Calculatrice.Addition(-10, 0));
    }

    @Test
    public void testSoustraction() {
        assertEquals(8, Calculatrice.Soustraction(10, 2));
        assertEquals(-7, Calculatrice.Soustraction(-5, 2));
        assertEquals(-5, Calculatrice.Soustraction(0, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, Calculatrice.Multiplication(5, 2));
        assertEquals(-4, Calculatrice.Multiplication(-2, 2));
        assertEquals(0, Calculatrice.Multiplication(2, 0));
    }

    @Test
    public void testDivision() {
        assertEquals(5, Calculatrice.Division(10, 2));
        assertEquals(-10, Calculatrice.Division(-20, 2));
        try {
            Calculatrice.Division((float) 6.0, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Le diviseur ne peut être zéro", e.getMessage());
        }
           
    }


    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
