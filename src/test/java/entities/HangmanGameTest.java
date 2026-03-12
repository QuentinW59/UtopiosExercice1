package entities;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


class HangmanGameTest {


    @Test
    void testChar_ShouldDecrementLives_When_Letters_Is_Wrong() {
        HangmanGame game = new HangmanGame("TEST");
        game.testChar('Z');
        assertEquals(6, game.getLives());

    }
    @Test
    void testWin_ShouldReturn_True_WordGuessed() {
        HangmanGame game = new HangmanGame("A");
        game.testChar('A');
        assertTrue(game.testWin());
    }
}