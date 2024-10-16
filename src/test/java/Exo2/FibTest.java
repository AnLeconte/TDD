package Exo2;

import static org.junit.Assert.*;

import org.example.Exo2.Fib;
import org.junit.Test;
import java.util.List;

public class FibTest {

    @Test
    public void testGetFibSeries_Range1_NotEmpty() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        assertFalse(result.isEmpty());
    }

    @Test
    public void testGetFibSeries_Range1_Size() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        assertEquals(1, result.size());
    }

    @Test
    public void testGetFibSeries_Range1_FirstElement() {
        Fib fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        assertEquals(Integer.valueOf(0), result.get(0));
    }

    @Test
    public void testGetFibSeries_Range6_Contains3() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertTrue(result.contains(3));
    }

    @Test
    public void testGetFibSeries_Range6_Size() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertEquals(6, result.size());
    }

    @Test
    public void testGetFibSeries_Range6_NotContains4() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        assertFalse(result.contains(4));
    }

    @Test
    public void testGetFibSeries_Range6_ExpectedList() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        List<Integer> expected = List.of(0, 1, 1, 2, 3, 5);
        assertEquals(expected, result);
    }

    @Test
    public void testGetFibSeries_Range6_SortedOrder() {
        Fib fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        for (int i = 0; i < result.size() - 1; i++) {
            assertTrue(result.get(i) <= result.get(i + 1));
        }
    }
}
