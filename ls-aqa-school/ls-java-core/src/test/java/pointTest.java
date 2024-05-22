import org.junit.jupiter.api.Test;
import ru.ls.qa.school.core.Point;

import static org.junit.jupiter.api.Assertions.*;

public class pointTest {
    @Test
    void pointDistance() {
        Point a = new Point(-1.0, 3.0);
        Point b = new Point(2.0, -1.0);

        double expected = 5.0;
        double actual = a.distance(b);

        assertEquals(expected, actual);
    }
}
