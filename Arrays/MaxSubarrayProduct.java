class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int maxProduct = nums[0];
        int minProduct = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            
            int tempMax = Math.max(curr, Math.max(curr*maxProduct, curr*minProduct));
            minProduct = Math.min(curr, Math.min(curr * maxProduct, curr * minProduct));
            
            maxProduct = tempMax;
            result = Math.max(result, maxProduct);
        }
        
        return result;
    }
}
