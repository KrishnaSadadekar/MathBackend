package com.example.DataStructure.Service;

import org.springframework.stereotype.Service;

@Service
public class EmiCalculatorService {

    public double calculateEmi(double principal, double interestRate, int tenure) {
        double monthlyRate = interestRate / (12 * 100); // Convert annual rate to monthly rate
        int tenureInMonths = tenure * 12; // Convert years to months
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, tenureInMonths)) /
                (Math.pow(1 + monthlyRate, tenureInMonths) - 1);
    }
}
