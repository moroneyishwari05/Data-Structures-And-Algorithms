class Solution {
    public boolean check(int[] nums) {
       int cnt = 0;
       int size = nums.length;

       for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % size]){
                cnt++;
            }

            if(cnt > 1){
                return false;
            }
       }
       return true;
    }
}
