package com.Calculator.Calculator.service;

import com.Calculator.Calculator.Service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {
    CalculatorService service = new CalculatorService();
    @Test
    void testPlus(){
        var expected1 = service.plus(1,4);
        var expected2 = service.plus(-1,4);
        var expected3 = service.plus(-1,-4);
        var expected4 = service.plus(1, -4);
        var expected5 = service.plus(1, 0);
        var expected6 = service.plus(0, 0);
        assertEquals(5,expected1);
        assertEquals(3,expected2);
        assertEquals(-5,expected3);
        assertEquals(-3,expected4);
        assertEquals(1,expected5);
        assertEquals(0,expected6);
    }
    @Test
    void testMinus(){
        var expected1 = service.minus(1,4);
        var expected2 = service.minus(-1,4);
        var expected3 = service.minus(-1,-4);
        var expected4 = service.minus(1, -4);
        var expected5 = service.minus(1, 0);
        var expected6 = service.minus(0, 0);
        assertEquals(-3,expected1);
        assertEquals(-5,expected2);
        assertEquals(3,expected3);
        assertEquals(5,expected4);
        assertEquals(1,expected5);
        assertEquals(0,expected6);
    }
    @Test
    void testMultiply(){
        var expected1 = service.multiply(2,4);
        var expected2 = service.multiply(-2,4);
        var expected3 = service.multiply(-2,-4);
        var expected4 = service.multiply(2, -4);
        var expected5 = service.multiply(1, 0);
        var expected6 = service.multiply(0, 0);
        assertEquals(8,expected1);
        assertEquals(-8,expected2);
        assertEquals(8,expected3);
        assertEquals(-8,expected4);
        assertEquals(0,expected5);
        assertEquals(0,expected6);
    }
    @Test
    void testDivide(){
        var expected1 = service.divide(4,2);
        var expected2 = service.divide(-4,2);
        var expected3 = service.divide(-4,-2);
        var expected4 = service.divide(4, -2);
        var expected5 = service.divide(0, 1);
        assertEquals(2,expected1);
        assertEquals(-2,expected2);
        assertEquals(2,expected3);
        assertEquals(-2,expected4);
        assertEquals(0,expected5);
        assertThrows(ArithmeticException.class, ()-> service.divide(5,0));
        try {
            service.divide(5,0);
            fail();
        }catch (ArithmeticException ignored){}
    }
}
