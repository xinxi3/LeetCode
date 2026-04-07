class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] rel = new int[nums.length];
        int n = nums.length;
        rel[0] = 1;
        int persum = 1;
        for (int i = 1; i < n; i++) {
            rel[i] = persum * nums[i-1];
            persum *= nums[i-1];
        }
        int lastsum =1;
        for(int i = n-1;i>=0;i--){
            rel[i]*=lastsum;
            lastsum*=nums[i];
        }
        return rel;
    }
}