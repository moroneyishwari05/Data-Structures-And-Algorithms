//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int N = n/3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);  //add number and its freq count to hashmap
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){ // Here Map refers to map interface in java
            if(entry.getValue() > N){
                list.add(entry.getKey()); //adding those values which have freq count more than N = n/3 
            }
        }

        Collections.sort(list); //sort the final list

        return list;
    }
}
