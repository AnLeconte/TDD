package Exo1;

import static org.junit.Assert.assertEquals;

import org.example.Exo1.GradingCalculator;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void testGetGrade_Score95_Attendance90_ExpectA() {
        GradingCalculator calculator = new GradingCalculator(95, 90);
        assertEquals('A', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score85_Attendance90_ExpectB() {
        GradingCalculator calculator = new GradingCalculator(85, 90);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score65_Attendance90_ExpectC() {
        GradingCalculator calculator = new GradingCalculator(65, 90);
        assertEquals('C', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score95_Attendance65_ExpectB() {
        GradingCalculator calculator = new GradingCalculator(95, 65);
        assertEquals('B', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score95_Attendance55_ExpectF() {
        GradingCalculator calculator = new GradingCalculator(95, 55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score65_Attendance55_ExpectF() {
        GradingCalculator calculator = new GradingCalculator(65, 55);
        assertEquals('F', calculator.getGrade());
    }

    @Test
    public void testGetGrade_Score50_Attendance90_ExpectF() {
        GradingCalculator calculator = new GradingCalculator(50, 90);
        assertEquals('F', calculator.getGrade());
    }
}
