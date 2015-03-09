/** GameEngineTest.java - CIS405 - teams
  */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class GameEngineTest {
    GameEngine ge;
    GameBoard board;
    Player p1, p2;
    @Before
    public void beef() throws Exception {
        ge = new GameEngine();
        assertNotNull("ge should not be null!", ge);
        board = new GameBoard(4, 6);
        assertNotNull("board should not be null!", board);
    }

    @Test
    public void testNumerals() throws Exception {
        assertEquals("", GameEngine.toNumerals(0));
        assertEquals("I", GameEngine.toNumerals(1));
        assertEquals("V", GameEngine.toNumerals(5));
        assertEquals("IX", GameEngine.toNumerals(9));
        assertEquals("X", GameEngine.toNumerals(10));
        assertEquals("@@@@@@@@@@@@@@", GameEngine.toNumerals(11));
        assertEquals(0, GameEngine.fromNumerals(""));
        assertEquals(1, GameEngine.fromNumerals("I"));
        assertEquals(5, GameEngine.fromNumerals("V"));
        assertEquals(9, GameEngine.fromNumerals("IX"));
        assertEquals(10, GameEngine.fromNumerals("X"));
        assertEquals(-1, GameEngine.fromNumerals("@@@@@@@@@@@@@@"));
        assertEquals(-1, GameEngine.fromNumerals("arbitrary string"));
    }

    @Test
    public void testMakePlayer() throws Exception {
        p1 = new Player("tylEr", board.getSquare(4, 0), 10);
        p2 = new Player("tylAr", board.getSquare(4, 8), 10);
        assertNotNull("p1 null?", p1);
        assertNotNull("p2 null?", p2);
    }

    @Test
    public void testParseString() throws Exception {
        // start here

    }
}