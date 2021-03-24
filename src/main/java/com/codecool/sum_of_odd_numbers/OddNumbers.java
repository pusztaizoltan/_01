package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream()
                      .filter(number -> number%2 == 1 || number%2 == -1)
                      .mapToInt(Integer::intValue)
                      .sum();
    }
}