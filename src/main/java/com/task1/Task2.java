package com.task1;

public class Task2 {

    public int solution(int[] A) {
        int binarian = binarian(A);
        int count = 0;
        float test = (float) customLog(2, binarian);

        for (int i = A.length - 1; i >= 0; i--) {
            int pow = (int) Math.pow(2, i);
            if (pow == binarian) {
                count++;
                break;
            } else if (pow < binarian) {
                count++;
                binarian = binarian - pow;
            }
        }
        if (test % 1 == 0) {
            return 1;
        } else {
            return count;

        }

    }

    private double customLog(double base, double logNumber) {
        return (Math.log(logNumber) / Math.log(base));
    }

    private int binarian(int[] A) {
        int binarian = 0;
        for (int value : A) {
            binarian += Math.pow(2, value);
        }
        return binarian;
    }

}
