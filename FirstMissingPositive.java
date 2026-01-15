//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//This Algorithm has -> time conplexity : O(n)
//                    -> Space Complexity : O(n)

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int x : nums){
            hs.add(x);
        }

        int smallest = 1;
        while(hs.contains(smallest)){
            smallest++;
        }

        return smallest;
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        int nums[] = {1,2,0};
        System.out.println(sol.firstMissingPositive(nums));
    }
}
