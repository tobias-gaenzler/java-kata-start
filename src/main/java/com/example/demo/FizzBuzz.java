package com.example.demo;

import java.util.stream.IntStream;

/**
 * See https://codingdojo.org/kata/FizzBuzz/
 */
public class FizzBuzz {

    public static void main(String[] args) {
        new FizzBuzz().run();
    }

    public void run() {
        IntStream.range(1, 101).forEach(number -> System.out.println(translateNumberToFizzBuzz(number)));
    }

    String translateNumberToFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
