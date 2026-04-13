//Given an integer array nums (0-indexed) and two integers target and start, find an index i such that nums[i] == target and abs(i - start) is minimized. Note that abs(x) is the absolute value of x.
//Return abs(i - start).
//It is guaranteed that target exists in nums.


class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int left = start;
        int right = start;

        while (left >= 0 || right < nums.length) {
            
            if (left >= 0 && nums[left] == target) {
                return start - left;
            }
            
            if (right < nums.length && nums[right] == target) {
                return right - start;
            }
            
            left--;
            right++;
        }

        return -1; // won't happen (target guaranteed)
    }
}
 

