package gradle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(8, App.add(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(15, App.multiply(5, 3));
    }
}