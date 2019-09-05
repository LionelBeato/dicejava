import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    Player testPlayer = new Player("Mike");

    @Test
    public void rollDice() {
    }

    @Test
    public void firstRoll() {
        assertNotNull(testPlayer.POINT);

    }

    @Test
    public void testToString() {
        assertEquals("Mike", testPlayer.getName());
    }
}