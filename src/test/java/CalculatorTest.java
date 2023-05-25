/*
 * Student ID: B201202040
 * Name Surname: Merve Ağaçayak
 * Course Name: SWE 202 Software Verification And Validation
 * Homework number: 1
 * Repository Address: 
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void testDivision(double a, double b, double expected) {
        assertEquals(expected, Calculator.divide(a, b));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected.");
    }
}
