package 滑动窗口;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        char[] str = s.toCharArray();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < str.length; right++) {
            char c = str[right];
            arr[c]++;
            while (arr[c] > 1) {
                arr[str[left]]--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}