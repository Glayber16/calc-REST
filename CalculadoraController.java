package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/operation/soma/{param1}/{param2}")
    public CalculadoraResponse soma(@PathVariable double param1, @PathVariable double param2) {
        double result = param1 + param2;
        return new CalculadoraResponse(result);
    }

     @GetMapping("/operation/subtracao/{param1}/{param2}")
    public CalculadoraResponse subtracao(@PathVariable double param1, @PathVariable double param2) {
        double result = param1 - param2;
        return new CalculadoraResponse(result);
    }
     @GetMapping("/operation/multiplicacao/{param1}/{param2}")
    public CalculadoraResponse multiplicacao(@PathVariable double param1, @PathVariable double param2) {
        double result = param1 * param2;
        return new CalculadoraResponse(result);
    }
     @GetMapping("/operation/divisao/{param1}/{param2}")
    public CalculadoraResponse divisao(@PathVariable double param1, @PathVariable double param2) {
        double result = param1 / param2;
        return new CalculadoraResponse(result);
    }

}
