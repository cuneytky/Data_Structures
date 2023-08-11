package com.cydeo.Task;


import java.util.Arrays;

public class TwoSumProblemMy {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int targetValue = 9;
        int[] result = twoSum(nums,targetValue);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int targetValue) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == targetValue) {
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }
}

/*
Problem: Two Sum
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Pseudo Code:
for(int i=0;i<length();i++) begin
    for(int j=0;j<length();j++) begin
        if (array[i] + array[j]==targetValue) return i & j
    end
end


Assignment-1
1. For the Two Sum problem, turn the pseudo code into a brute-force solution.
2. Find the time complexity of your solution.
3. Are there any other cases we need to handle
 */