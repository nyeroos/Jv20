package com.nyeroos.firstlesson.JV20.pr31;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculate() {
        Calculator calculator = new Calculator(2, 3, '+');
        Assert.assertNotNull(calculator);
    }

    @Test
    public void calculate2() {
        Calculator calculator = new Calculator(2, 3, '*');
        Assert.assertEquals(5.0, calculator.getResult(), 0);
    }
}
