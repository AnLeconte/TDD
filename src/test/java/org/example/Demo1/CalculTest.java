package org.example.Demo1;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    @Test
    public void whenAddition_1_2_Then_3(){
        // Arrange
        Calcul cal = new Calcul();
        double x = 1;
        double y = 2;

        double result = cal.addition(x, y);

        // Assert
        Assert.assertEquals(3, result,0);


    }
}
