class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = nums[0];
        int maxSum = nums[0];
        for(int i=1 ;i < nums.length;i++){
            curSum = Math.max(nums[i],curSum + nums[i]);
            //如果前面的和加上我还没我自己大，我为什么要加上他，就以当前结点位起点
            maxSum = Math.max(curSum ,maxSum);
        }
        return maxSum;
    }
}