import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class oddTest {
    @Test
    void testOdd() {

        int num = 2;

        boolean expected = false;
        boolean actual = num % 2 != 0;

        assertEquals(expected, actual);
    }
}
