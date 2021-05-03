package com.practice.array3;

import java.util.ArrayList;

public class SeriesUp {

    public static int[] solution(int n) {
        ArrayList<Integer> resultArray= new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                resultArray.add(j);
            }
        }
        return resultArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
