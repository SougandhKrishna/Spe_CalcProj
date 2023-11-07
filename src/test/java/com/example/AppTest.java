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
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b), 0.01);
    }
    @Test
    public void test_add_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }
    @Test
    public void test_sub_positive(){
        int a = 2;
        int b = 2;
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, calculator.sub(a, b), 0.01);
    }
    @Test
    public void test_sub_negative(){
        int a = 2;
        int b = 2;
        int expectedResult = -1;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }
    @Test
    public void test_mul_positive(){
        int a = 2;
        int b = 2;
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, calculator.mul(a, b), 0.01);
    }
    @Test
    public void test_mul_negative(){
        int a = 2;
        int b = 2;
        int expectedResult = 8;
        Assert.assertNotEquals(expectedResult, calculator.mul(a, b));
    }
    @Test
    public void test_div_positive(){
        double a = 2;
        double b = 2;
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, calculator.div(a, b), 0.001);
    }
    @Test
    public void test_div_negative(){
        int a = 2;
        int b = 2;
        int expectedResult = -1;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}