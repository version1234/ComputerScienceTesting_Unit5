package com.hackbright.Unit5;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNumber {
    public static int findMissingNumber(int[] nums, int maxNum) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i = 1; i <= maxNum; i += 1) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int findMissingNumberWithoutCreatingObject(int[] nums, int maxNum) {

//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        Arrays.sort(nums);
        for (int i = 0; i < maxNum; i++) {
            if (!(nums[i] ==i+1) ){
                return i+1;
            }
        }
        return 0;
    }
}
