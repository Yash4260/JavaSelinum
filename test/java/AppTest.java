import org.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testAddition() {
        App app = new App();
        int result = app.add(6, 3);
        assertEquals(9, result, "5 + 3 should equal 8");
    }

    @Test
    void testSubtraction() {
        App app = new App();
        int result = app.add(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}