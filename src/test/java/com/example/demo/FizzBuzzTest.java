package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    public void shouldReturnFizzFor9() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(9);
        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void shouldReturnBuzzFor10() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(10);
        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void shouldReturnFizzBuzzFor15() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(15);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}