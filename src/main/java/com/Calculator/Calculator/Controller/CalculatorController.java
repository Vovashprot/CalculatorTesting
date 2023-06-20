package com.Calculator.Calculator.Controller;

import com.Calculator.Calculator.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorService service;
    public CalculatorController(CalculatorService service){
        this.service = service;
    }
    @RequestMapping("")
    public String greetings(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping("/plus")
    public Integer calculatorPlus(@RequestParam("num1") Integer input1, @RequestParam("num2") Integer input2){
        return service.plus(input1,input2);
    }
    @GetMapping("/minus")
    public Integer calculatorMinus(@RequestParam("num1") Integer input1, @RequestParam("num2") Integer input2){
        return service.minus(input1,input2);
    }
    @GetMapping("/multiply")
    public Integer calculatorMultiply(@RequestParam("num1") Integer input1, @RequestParam("num2") Integer input2){
        return service.multiply(input1,input2);
    }
    @GetMapping("/divide")
    public Integer calculatorDivide(@RequestParam("num1") Integer input1, @RequestParam("num2") Integer input2){
        return service.divide(input1,input2);
    }
}
