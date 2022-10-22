package com.hackbright.Unit5;

public class MissingNumberMain {

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,7,8,9,10};
        MissingNumber missingNumber = new MissingNumber();
        int missing = missingNumber.findMissingNumber(nums,10);
        System.out.println("Missing Number :" + missing);
        missing = missingNumber.findMissingNumberWithoutCreatingObject(nums,10);
        System.out.println("Missing Number :" + missing);


    }


//    public static int missingNumber(int[] nums, int maxNum) {
//
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        for (int i = 1; i <= maxNum; i += 1) {
//            if (!set.contains(i)) {
//                return i;
//            }
//        }
//        return 0;
//    }

}