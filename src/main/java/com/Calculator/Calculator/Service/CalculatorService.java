package com.Calculator.Calculator.Service;

public class CalculatorService {
    public Integer plus(Integer input1, Integer input2){
        int result = input1 + input2;
        return result;
    }
    public Integer minus(Integer input1, Integer input2){
        int result = input1 - input2;
        return result;
    }
    public Integer multiply(Integer input1, Integer input2){
        int result = input1 * input2;
        return result;
    }
    public Integer divide(Integer input1, Integer input2){
        int result = input1 / input2;
        return result;
    }
}
