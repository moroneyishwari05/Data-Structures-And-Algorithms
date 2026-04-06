class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1, -1};
        res[0] = findFirst(nums, target);
        res[1] = findLast(nums, target);

        return res;
    }

    private int findFirst(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while ( low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid]  == target){
                ans = mid;
                high = mid - 1; //move left 
            }

            else if(nums[mid] > target){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private int findLast(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while ( low <= high){
            int mid = low + (high - low) / 2;

            if(nums[mid] == target){
                ans = mid;
                low = mid + 1; //move right 
            }

            else if(nums[mid] > target){
                high = mid - 1;
            }

            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        sol.searchRange(nums, target);
        int res[] = new int[2];
        for(int num : res){
            System.out.println(num);
        }
    }
}
