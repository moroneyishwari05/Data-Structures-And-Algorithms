//It has a Runtime complexity of O(log n)

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while ( low <= high){
            int mid = low + (high-low)/2;
       
            if(nums[mid] == target){
                return mid;
            }

            else if(target < nums[mid]){
                 high = mid - 1;
            }

            else {
                 low = mid + 1;
            }
        
        } 
        
        return -1;
        
    }

    public static void main(String args[]){
        Solution sol = new Solution();
        int nums[] = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(sol.search(nums, target));
    }
}
