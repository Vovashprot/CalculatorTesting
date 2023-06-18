package com.Calculator.Calculator.Controller;

import com.Calculator.Calculator.Service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Calculator")
public class CalculatorController {
    public final CalculatorService service;
    public CalculatorController(CalculatorService service){
        this.service = service;
    }
    @GetMapping("/plus")
    public Integer calculatorPlus(@RequestParam("input1") Integer input1, @RequestParam("input2") Integer input2){
        return service.plus(input1,input2);
    }
    @GetMapping("/minus")
    public Integer calculatorMinus(@RequestParam("input1") Integer input1, @RequestParam("input2") Integer input2){
        return service.minus(input1,input2);
    }
    @GetMapping("/multiply")
    public Integer calculatorMultiply(@RequestParam("input1") Integer input1, @RequestParam("input2") Integer input2){
        return service.multiply(input1,input2);
    }
    @GetMapping("/divide")
    public Integer calculatorDivide(@RequestParam("input1") Integer input1, @RequestParam("input2") Integer input2){
        return service.divide(input1,input2);
    }
}
