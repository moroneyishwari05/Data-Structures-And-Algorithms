//PROBLEM STATEMENT: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

class Solution{
  public int missingNumber(int[] nums){
      int n = nums.length; //length of array
      int sumExpected = n * (n+1) / 2; //sum of n numbers
      int sumActual = 0; //initialise with zero

      for(int i = 0; i < nums.length; i++){
          sumActual += nums[i]; //find the sum of all elements in the array
      }
      return sumExpected - sumActual; //gives exactly the missing number
  }

  public static void main(String args[]){
      Solution sol = new Solution();
      int nums[] = {3,0,1};
      System.out.println(sol.missingNumber(nums));
  }
}
