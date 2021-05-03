package com.practice.array3;

public class MaxSpan {

    public static int solution(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 0) {
            return 0;
        }
        int counter;
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int j = i + 1;
            counter = 1;
            for (int x = j; x < nums.length; x++) {
                counter++;
                if (nums[x] == value && counter > result) {
                    result = counter;
                }
            }
        }
        return result;
    }
}
