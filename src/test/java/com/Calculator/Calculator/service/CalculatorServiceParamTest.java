package com.Calculator.Calculator.service;
import com.Calculator.Calculator.Service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceParamTest {
    CalculatorService service = new CalculatorService();
    private  static Collection<Arguments> parameters(){
        return List.of(
                Arguments.of(1,2),
                Arguments.of(-4,-7),
                Arguments.of(-4,7),
                Arguments.arguments(4,-7));

    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testMinus (int num1, int num2){
        var actual = service.minus(num1, num2);
        var expected = num1 - num2;
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testPlus (int num1, int num2){
        var actual = service.plus(num1, num2);
        var expected = num1 + num2;
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testMultiply (int num1, int num2){
        var actual = service.multiply(num1, num2);
        var expected = num1 * num2;
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testDivide (int num1, int num2){
        var actual = service.divide(num1, num2);
        var expected = num1 / num2;
        assertEquals(actual, expected);
    }
}
