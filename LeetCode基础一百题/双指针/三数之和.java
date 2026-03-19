package 双指针;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans =new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            if(i>0 &&nums[i]==nums[i-1]) continue;
            int l=i+1 , r=nums.length-1;
            int target =0- nums[i];
            while(l<r){
                if(nums[l]+nums[r]==target){
                    ans.add(List.of(nums[i], nums[l], nums[r]));
                    while(l<r&&nums[l]== nums[l+1]) l++;
                    while(l<r&&nums[r]== nums[r-1]) r--;
                    l++;r--;
                }else if(nums[l]+nums[r]<target){
                    l++;
                }else {
                    r--;
                }
            }
        }
        return ans;
    }
}