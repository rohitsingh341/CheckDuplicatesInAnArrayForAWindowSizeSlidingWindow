package com.rohit.dsa;

public class CheckDuplicatesInAnArrayForAWindowSizeSlidingWindow {
    public static void main(String[] args) {
        //int [] nums = {1,2,3,2,3,4};  FALSE
        //int [] nums = {1,2,3,2,3,3};  TRUE
        int [] nums = {1,2,3,2,4,3,4,67,7,7}; // TRUE

        boolean containsDuplicates = checkDuplicates(nums, 2);
        System.out.println("Contains duplicates - " + containsDuplicates);
    }

    // Time Complexity - O(n*k)
    public static boolean checkDuplicates(int [] nums, int windowSize) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < Math.min(i + windowSize, nums.length); j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
