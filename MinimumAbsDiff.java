//Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
//Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//a, b are from arr
//a < b
//b - a equals to the minimum absolute difference of any two elements in arr

//COMPLEXITY:   
//TIME- O(N log N)
//SPACE: O(1)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr); //sort the array

        List<List<Integer>> result = new ArrayList<>(); //create a list of list to store the minDiff pairs only

        int minDiff = Integer.MAX_VALUE ;

        for(int i = 0; i < arr.length - 1; i++){
            minDiff = Math.min(minDiff, arr[i+1] - arr[i]); //find minimum abs diff
        }

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i+1] - arr[i] == minDiff){
                result.add(Arrays.asList(arr[i], arr[i+1]));  //add pairs with min abs diff to the list
            }
        }

        return result;

    }

    public static void main(String args[]){
        Solution sol = new Solution();
        int arr[] = {4,2,1,3};

    }
}
