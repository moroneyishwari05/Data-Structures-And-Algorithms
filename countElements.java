//Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

 class Solution {
    public int countElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {   //find the min and max element of the array 
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int count = 0; //count elements strictly smaller & greater element
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;


    }
}
