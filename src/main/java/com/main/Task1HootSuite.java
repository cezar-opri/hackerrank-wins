package com.main;

import com.task1.Task1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Task1HootSuite {
    // Complete the flippingBits function below.
    public static int solution(int[] A) {


        Map<Integer, Integer> m = new HashMap<>();
        // Maximum sum of given numbers
        int maxSum = 0;
        for (int number : A) {
            int sum = sumOfDigits(number);
            // If we have no such sum of digits in the map
            if (!m.containsKey(sum)) {
                // add this sum to the map as a key and the number
                // as a value
                m.put(sum, number);
            } else {
                // if we have the sum of digits in the map
                // if sum of current number and number from
                // the map with the same sum of digits are bigger than
                // maximum encountered sum then update the maximum sum
                maxSum = Integer.max(maxSum, m.get(sum) + number);
                // Save current number as value for current sum
                // of digits if it is bigger than number from the map
                //if we have more than 2 numbers with same digit to be shore to have the biggest
                m.put(sum, Integer.max(number, m.get(sum)));

            }
        }
        // if the are no numbers with equal sum return -1
        return maxSum != 0 ? maxSum : -1;
    }


    static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        int[] A = {51,17, 71, 15, 80};
        int[] B = {51, 71, 17, 42};
        int[] C = {42,33,60};
        int[] D = {51,32,43};
        Task1 t1 = new Task1();
        System.out.println(t1.solution(A));
        System.out.println(t1.solution(B));
        System.out.println(t1.solution(C));
        System.out.println(t1.solution(D));
    }
}
