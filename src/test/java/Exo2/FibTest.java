package Exo2;

import static org.junit.Assert.*;

import org.example.Exo2.Fib;
import org.junit.Test;
import java.util.List;

public class FibTest {

    @Test
    public void testGetFibSeries_Range1() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();

        assertFalse(result.isEmpty());

        assertEquals(1, result.size());
        assertEquals(Integer.valueOf(0), result.get(0));
    }

    @Test
    public void testGetFibSeries_Range6() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();

        assertTrue(result.contains(3));

        assertEquals(6, result.size());

        assertFalse(result.contains(4));

        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);
        assertEquals(expected, result);

        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i) <= result.get(i + 1));
        }
    }
}
