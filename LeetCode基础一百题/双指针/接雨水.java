package 双指针;

class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int left_max=0;
        int right_max=0;
        int ans=0;
        while(left<height.length){
            left_max = Math.max(left_max, height[left]);
            ans += left_max;
            left++;
        }
        while(right>=0){
            right_max = Math.max(right_max, height[right]);
            ans += right_max;
            right--;
        }
        ans-=height.length*Math.max(right_max, left_max);
        for(int i =0;i<height.length;i++){
            ans-=height[i];
        }
        return ans;
    }
}