package com.example.DataStructure.Controller;


import com.example.DataStructure.Service.BinaryService;
import com.example.DataStructure.Service.CodingService;
import com.example.DataStructure.binaryModel.BinaryTraversal;
import com.example.DataStructure.binaryModel.BinaryTree;
import com.example.DataStructure.binaryModel.Node;
import com.example.DataStructure.binaryModel.Traversal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@CrossOrigin
public class Home {

    int nodes[] = {25, 12, 10, 11, 9, 20, 15, 18, 60, 33, 80};
    Node r;

    @Autowired
    BinaryService binaryService;

    @Autowired
    CodingService codingService;

    //Binary Controller
    @PostMapping("/createBinaryTree")
    public ResponseEntity<?> getBinary(@RequestBody int[] myArray) {
        Arrays.stream(myArray).forEach(x -> System.out.println(x));
        Traversal traversal = binaryService.createBinary(myArray);

        return ResponseEntity.ok(traversal);

    }

    @GetMapping("/digitcount")
    public ResponseEntity<?> countDigit(@RequestParam("inputValue") Integer inputValue) {
        String result = codingService.digitCountIsEvenOrNor(inputValue);

        return ResponseEntity.ok(result);

    }


    @GetMapping("/primeNumber")
    public ResponseEntity<?> primeNumber(@RequestParam("inputValue") Integer inputValue) {
        String result = codingService.primeNumber(inputValue);

        return ResponseEntity.ok(result);

    }

    @GetMapping("/factorial")
    public ResponseEntity<?> factorial(@RequestParam("inputValue") Integer inputValue) {
        int result = codingService.factorial(inputValue);

        return ResponseEntity.ok(result);

    }

    @GetMapping("/permutation")
    public ResponseEntity<?> permutation(@RequestParam("inputValue") String str) {

        List<String> ls = new ArrayList<>();
        List<String> result = codingService.permutationS(str, ls);
        return ResponseEntity.ok(result);

    }

    @GetMapping("/perfectSquare")
    public ResponseEntity<?> perfectNumber(@RequestParam("inputValue") int number) {

        String result = codingService.perfectSquare(number);
        return ResponseEntity.ok(result);

    }
    @GetMapping("/sumofdigit")
    public ResponseEntity<?> sumOfDigit(@RequestParam("inputValue") int number) {

        double result = codingService.sumOfDigits(number);
        return ResponseEntity.ok(result);

    }

    @GetMapping("/sumOfNatural")
    public ResponseEntity<?> sumOfNaturalNumber(@RequestParam("inputValue") int number) {

        String result = codingService.sumOfNatural(number);
        return ResponseEntity.ok(result);

    }


    @GetMapping("/leapYear")
    public ResponseEntity<?> leapyear(@RequestParam("inputValue") Double number) {

        String result = codingService.LeapYear(number);
        return ResponseEntity.ok(result);

    }

    @GetMapping("/fibonacci")
    public ResponseEntity<?> fibonacci(@RequestParam("inputValue") int number) {

        List<Integer>result = codingService.fibonacciSeries(number);
        return ResponseEntity.ok(result);

    }
}
