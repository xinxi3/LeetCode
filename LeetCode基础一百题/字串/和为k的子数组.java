package 字串;

import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        int presum = 0;
        HashMap<Integer,Integer> preSumMap =new HashMap<>();
        preSumMap.put(0,1);//初始化前缀和为0的情况出现1次（处理数组开头就满足和为k的情况）
        for(int num : nums){
            presum +=num;

            if(preSumMap.containsKey(presum -k)){
                count+=preSumMap.get(presum -k);
            }
            //将当前前缀和存入哈希表（次数加一）
            preSumMap.put(presum, preSumMap.getOrDefault(presum ,0) + 1);
        }
        return count;
    }
}