package com.practice.array3;

public class LinearIn {

    private static boolean check(int[] array, int valueToCheck) {
        boolean result = false;
        for (int i : array) {
            if (i == valueToCheck) {
                result = true;
            }
        }
        return result;
    }

    public static boolean solution(int[] outer, int[] inner) {
        boolean result = true;
        for (int i = 0; i < inner.length; i++) {
            if (!check(outer, inner[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
