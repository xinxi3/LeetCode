import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<int[]>();
        if (intervals.length == 0) {
            return result.toArray(new int[0][]);
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });

        int[] temp = { intervals[0][0], intervals[0][1] };
        result.add(temp);

        for (int i = 1; i < intervals.length; i++) {
            int L = intervals[i][0], R = intervals[i][1];
            if (result.get(result.size() - 1)[1] >= L) {
                result.get(result.size() - 1)[1] = Math.max(R, result.get(result.size() - 1)[1]);
            } else {
                result.add(new int[] { L, R });
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}