package com.example.DataStructure.Service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CodingService {

    static List<String> ls = new ArrayList<>();

    public String digitCountIsEvenOrNor(int number) {

        int i = 0;
        while (number > 0) {
            number = number / 10;
            i++;
        }
        System.out.println("The total Digits are " + i);
        if (i % 2 == 0) {
            return "The digits count is even";
        } else {
            return "digit count is odd! ";
        }
    }


    public int factorial(int number) {

        int fact = 1;
        for (int i = 1; i < number + 1; i++) {
            fact = fact * i;

        }

        return fact;
    }


    public String primeNumber(int number) {

        Boolean isSucess = true;

        if (number == 1 || number == 2) {
            return "Number is not a Prime!";
        }
        for (int i = 2; i < number / 2; i++) {

            if (number % i == 0) {
                isSucess = false;
                break;
            }

        }
        if (isSucess) {
            return "Number is prime!";
        } else {
            return "Number is not a prime!";
        }


    }

    public List<String> permutationS(String str, List<String> list) {
        ls = list;
        int n = str.length();
        permuatation(str, 0, n);
        return ls;
    }

    private static void permuatation(String str, int l, int r) {

        if (l == r) {
            ls.add(str);
            System.out.print(str + " ");
        }
        for (int i = l; i < str.length(); i++) {

            str = swapS(str, l, i);

            permuatation(str, l + 1, r);

            str = swapS(str, l, i);
        }

    }

    private static String swapS(String str, int i, int j) {

        char[] c = str.toCharArray();

        char ch = c[i];
        c[i] = c[j];
        c[j] = ch;
        return String.valueOf(c);
    }

    public String perfectSquare(int number) {
        for (int i = 0; i < number / 2; i++) {

            if (i * i == number) {
                return "Perfect Number is " + i;
            }

        }
        return "There is no perfect Square number !";
    }

    public double sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int d = number % 10;
            sum = sum + d;
            number = number / 10;
        }

        return sum;
    }

    public String LeapYear(double y)
    {
        if(y%400==0||(y%4==0 && y%100!=0))
        {
            return"This is a leap Year! ";
        }
        else
        {
            return"This is not a leap year ! ";
        }
    }

    public List<Integer> fibonacciSeries(int Number)
    {
        List<Integer>ls=new ArrayList<>();

        int a=0,s=1,b=1;

        System.out.print(a+" ");
        for (int i = 0; i <Number; i++) {
            ls.add(s);
            System.out.print(s+" ");
            s=a+b;
            a=b;
            b=s;
        }
        return ls;
    }

    public String sumOfNatural(int n)
    {
        int sum=0;
        for (int i = 1; i <=n ; i++) {

            sum=sum+i;

        }
        return "The sum of Natural Number is "+sum;
    }
}


