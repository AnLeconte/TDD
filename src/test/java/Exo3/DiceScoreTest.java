package Exo3;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.example.Exo3.DiceScore;
import org.example.Exo3.Ide;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DiceScoreTest {

    @Mock
    private Ide mockIde;

    private DiceScore diceScore;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        diceScore = new DiceScore();
        diceScore.de = mockIde;
    }

    @Test
    public void testIdenticalDiceNotSix() {
        when(mockIde.getRoll()).thenReturn(4, 4);

        int score = diceScore.getScore();

        assertEquals(18, score);
    }

    @Test
    public void testIdenticalDiceSix() {
        when(mockIde.getRoll()).thenReturn(6, 6);

        int score = diceScore.getScore();

        assertEquals(30, score);
    }

    @Test
    public void testDifferentDice() {
        when(mockIde.getRoll()).thenReturn(3, 5);

        int score = diceScore.getScore();

        assertEquals(5, score);
    }
}
