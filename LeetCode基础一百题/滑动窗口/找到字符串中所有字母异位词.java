package 滑动窗口;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int plen = p.length();
        int slen = s.length();
        if (slen < plen)
            return ans;
        int[] count = new int[128];
        for (int i = 0; i < plen; i++) {
            count[p.charAt(i)]++;
            count[s.charAt(i)]--;
        }
        if (isAllZero(count)) {
            ans.add(0);
        }
        for (int left = 1; left <= slen - plen; left++) {
            //移除窗口左侧的字符（+1）
            count[s.charAt(left - 1)]++;
            //添加窗口右侧的新字符（-1）
            count[s.charAt(left + plen - 1)]--;

            if (isAllZero(count))
                ans.add(left);
        }
        return ans;
    }

    private boolean isAllZero(int[] count) {
        for (int num : count) {
            if (num != 0)
                return false;
        }
        return true;
    }
}