package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping(name = "calculator", value = "/calc")
public class CalculatorController {

    @GetMapping(name = "mult", value = "/mult/{op1}/{op2}")
    String mult(@PathVariable int op1, @PathVariable int op2) {
        return String.format("%d = %d * %d", BigInteger.valueOf(op1).multiply(BigInteger.valueOf(op2)), op1, op2);
    }

    @GetMapping(name = "div", value = "/div/{op1}/{op2}")
    String div(@PathVariable int op1, @PathVariable int op2) {
        return String.format("%f = %d / %d", (float) op1 / op2, op1, op2);
    }

    @GetMapping(name = "sum", value = "/sum/{op1}/{op2}")
    String sum(@PathVariable int op1, @PathVariable int op2) {
        return String.format("%d = %d + %d", op1 + op2, op1, op2);
    }

    @GetMapping(name = "subtract", value = "/subtract/{op1}/{op2}")
    String subtract(@PathVariable int op1, @PathVariable int op2) {
        return String.format("%d = %d - %d", op1 - op2, op1, op2);
    }
}
