package 子串;

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tmap = new HashMap<>();
        HashMap<Character, Integer> windowmap = new HashMap<>();
        char[] tstr = t.toCharArray();
        char[] sstr = s.toCharArray();
        for (char c : tstr) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);

        }
        int left = 0, right = 0;
        int start = 0, minlen = Integer.MAX_VALUE;
        int valid = 0;
        while (right < sstr.length) {
            char c = sstr[right];
            right++;

            if (tmap.containsKey(c)) {
                windowmap.put(c, windowmap.getOrDefault(c, 0) + 1);
                if (windowmap.get(c).equals(tmap.get(c))) {
                    valid++;
                }
            }

            while (valid == tmap.size()) {
                if (right - left < minlen) {
                    start = left;
                    minlen = right - left;
                }

                char d = sstr[left];
                left++;
                if (tmap.containsKey(d)) {
                    if (windowmap.get(d).equals(tmap.get(d))) {
                        valid--;
                    }
                    windowmap.put(d, windowmap.get(d) - 1);
                }
            }

        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}