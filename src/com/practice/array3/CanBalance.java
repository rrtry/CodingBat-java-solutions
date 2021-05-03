package com.practice.array3;

public class CanBalance {

    public static boolean solution(int[] nums) {
        boolean canBalance = false;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int rightSum = 0;
            leftSum += nums[i];
            for (int x = j; x < nums.length; x++) {
                rightSum += nums[x];
            }
            if (leftSum == rightSum) {
                canBalance = true;
                break;
            }
        }
        return canBalance;
    }
}
