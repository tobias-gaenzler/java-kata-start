package de.tobiasgaenzler.javakatastart;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29, 31, 32, 34, 37, 38, 41, 43, 44, 46, 47, 49, 52, 53, 56, 58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 77, 79, 82, 83, 86, 88, 89, 91, 92, 94, 97, 98})
    public void shouldReturnNumberIfNotDivisibleBy3Or5() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(1);
        assertThat(result).isEqualTo("1");
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99})
    public void shouldReturnFizzForDivisibleBy3AndNot5() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(9);
        assertThat(result).isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100})
    public void shouldReturnBuzzForDivisibleBy5AndNot3() {
        String result = new FizzBuzz().translateNumberToFizzBuzz(10);
        assertThat(result).isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 75, 90})
    public void shouldReturnFizzBuzzForDivisibleBy3And5(int number) {
        String result = new FizzBuzz().translateNumberToFizzBuzz(number);
        assertThat(result).isEqualTo("FizzBuzz");
    }
}