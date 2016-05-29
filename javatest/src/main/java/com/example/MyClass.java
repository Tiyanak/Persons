package com.example;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class MyClass {

    public static void main(String[] args){
        final int number = readPositiveNumber();
        final int nextPrime = nextPrime(number);
        final List<Integer> primeFactors = primeFactors(number);

        System.out.printf("You entered %d\n", number);
        System.out.printf("Next prime is %d \n", nextPrime);
        for(final Integer factor: primeFactors){
            System.out.printf("A prime factor is %d\n", factor);
        }

    }

    private static int nextPrime(int number){

    }

    private static List<Integer> primeFactors(int number){
        return new ArrayList<>();
    }

    private static int readPositiveNumber() throws IOException{
        final BufferedReader reader = new BufferedReader();
    }
}
