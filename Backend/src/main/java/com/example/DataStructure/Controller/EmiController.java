package com.example.DataStructure.Controller;

import com.example.DataStructure.Service.EmiCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class EmiController {

    @Autowired
    EmiCalculatorService emiCalculatorService;
    @GetMapping("/calculateEmi")
    public double calculateEmi(@RequestParam double principal,
                               @RequestParam double interestRate,
                               @RequestParam int tenure) {
        return emiCalculatorService.calculateEmi(principal, interestRate, tenure);
    }

}
