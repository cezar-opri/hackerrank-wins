package com.task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public int solution(int[] A) {

        Map<Integer, Integer> m = new HashMap<>();
        int maxSum = 0;
        for (int number : A) {
            int sum = sumOfDigits(number);
            if (!m.containsKey(sum)) {
                m.put(sum, number);
            } else {
                maxSum = Integer.max(maxSum, m.get(sum) + number);
                m.put(sum, Integer.max(number, m.get(sum)));

            }
        }
        return maxSum != 0 ? maxSum : -1;
    }

    private int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
