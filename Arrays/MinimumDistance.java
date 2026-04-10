//You are given an integer array nums.
//A tuple (i, j, k) of 3 distinct indices is good if nums[i] == nums[j] == nums[k].
//The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.
//Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: Store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        // Step 2: Process each value
        for (List<Integer> list : map.values()) {
            if (list.size() < 3) continue;

            // Step 3: Check consecutive triplets
            for (int i = 0; i <= list.size() - 3; i++) {
                int dist = 2 * (list.get(i + 2) - list.get(i));
                minDistance = Math.min(minDistance, dist);
                found = true;
            }
        }

        return found ? minDistance : -1;
    }
}
