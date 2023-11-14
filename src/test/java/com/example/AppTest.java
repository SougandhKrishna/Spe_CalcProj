package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private App calculator;
    @Before
    public void setUp() {
        calculator = new App();
    }
    @Test
    public void test_add_positive(){
        double a = 10;
        double b = 20;
        double expectedResult = 30;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0.01);
    }
    @Test
    public void test_add_negative(){
        double a = 1.5;
        double b = 2.4;
        double expectedResult = 2;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }
    @Test
    public void test_sub_positive(){
        double a = 15;
        double b = 15;
        double expectedResult = 0;
        Assert.assertEquals(expectedResult, calculator.sub(a, b), 0.01);
    }
    @Test
    public void test_sub_negative(){
        double a = 20;
        double b = 12.5;
        double expectedResult = 3;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }
    @Test
    public void test_mul_positive(){
        double a = 4;
        double b = 4;
        double expectedResult = 16;
        Assert.assertEquals(expectedResult, calculator.mul(a, b), 0.01);
    }
    @Test
    public void test_mul_negative(){
        double a = 2.5;
        double b = 3.5;
        double expectedResult = 9;
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b));
    }
    @Test
    public void test_div_positive(){
        double a = 4;
        double b = 2;
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.div(a, b), 0.001);
    }
    @Test
    public void test_div_negative(){
        double a = 4;
        double b = 2;
        double expectedResult = 1;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
    @Test
    public void test_div_negative_new(){
        double a = 46;
        double b = 2;
        double expectedResult = 22;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}