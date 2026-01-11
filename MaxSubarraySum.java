class Solution {
    int maxSubarraySum(int[] arr) {
        int currSum = arr[0]; //initialise the current sum with first element
        int maxSum = arr[0]; //initialise the maximum sum with first element
      
        for(int i = 1; i < arr.length; i++){ //start the loop with second element
              currSum = Math.max(arr[i], currSum+arr[i] ); //update the currSum and find the max while traversing the array
              maxSum = Math.max(maxSum, currSum); //find the max sum 
        }
        return maxSum;
    }
    
    public static void main(String args[]){
        Solution sol = new Solution(); //object of class solution
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(sol.maxSubarraySum(arr));
        
    }
}
