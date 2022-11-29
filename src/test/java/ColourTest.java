import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColourTest {

    @Test
    @DisplayName("Test of the three parameter Colour constructor.")
    public void test3ValueColourConstructor() {
        Colour colour = new Colour(1.0f, 0.0f, 0.5f);
        assertEquals(1.0f, colour.getRed(), 0.0);
        assertEquals(0.0f, colour.getGreen(), 0.0);
        assertEquals(0.5f, colour.getBlue(), 0.0);
    }

    @Test
    @DisplayName("Second test of the three parameter Colour constructor.")
    public void test3ValueColourConstructor2() {
        Colour colour = new Colour(0.0f, 0.5f, 1.0f);
        assertEquals(0.0f, colour.getRed(), 0.0);
        assertEquals(0.5f, colour.getGreen(), 0.0);
        assertEquals(1.0f, colour.getBlue(), 0.0);
    }

    @Test
    @DisplayName("Test to catch values entered into constructor that are too large or too small.")
    public void test3ValueOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> new Colour(-1.0f, 1.2f, 100.0f)); // 2nd value of assertThrows must be an Executable. Anonymous
                                                                                                            // lambda functions provide this functionality.
    }
}
