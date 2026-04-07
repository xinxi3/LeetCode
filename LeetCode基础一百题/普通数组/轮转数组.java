class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reversal(nums, 0, n - 1);
        reversal(nums, 0, k - 1);
        reversal(nums, k, n - 1);
    }

    public void reversal(int[] nums, int L, int R) {
        while (L < R) {
            int temp = nums[L];
            nums[L] = nums[R];
            nums[R] = temp;
            L++;
            R--;
        }
    }
}