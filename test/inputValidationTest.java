import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class inputValidationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    static void guessCheck() {
        System.out.println("BAD INPUT");
        boolean expected = false;
        boolean actual = inputValidation.guessCheck("BAD USER INPUT");
        assertEquals(expected, actual);

        System.out.println("\nGOOD INPUT");
        expected = true;
        actual = inputValidation.guessCheck("2");
        assertEquals(expected, actual);
    }
}