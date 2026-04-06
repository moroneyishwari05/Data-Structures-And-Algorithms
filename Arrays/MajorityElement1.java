//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length; //length of array
        int N = n/2; //condition

        HashMap<Integer, Integer> map = new HashMap<>(); 

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1); //storing number with its frequency count 

            if(map.get(num) > N ){ //check which freq count exceed the condition
                return num;
            }
        }
        
        return -1;
    }
}
