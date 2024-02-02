import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(7, MathUtils.add(5,2));
    }

    @Test
    void subtract() {
        assertEquals(2, MathUtils.subtract(6, 4));
    }

    @Test
    void multiply() {
        assertEquals(63, MathUtils.multiply(21, 3));
    }

    @Test
    void divide() {
        assertAll(() -> assertEquals(6, MathUtils.divide(12, 2)),
                () -> assertEquals(-1.0, MathUtils.divide(9, 0)));
    }
}