package 矩阵;
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        List<Integer> res = new ArrayList<Integer>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            if (top > bottom)
                break;

            for (int j = top; j <= bottom; j++) {
                res.add(matrix[j][right]);
            }
            right--;
            if (left > right)
                break;

            for (int k = right; k >= left; k--) {
                res.add(matrix[bottom][k]);
            }
            bottom--;
            if (top > bottom)
                break;
            for (int l = bottom; l >= top; l--) {
                res.add(matrix[l][left]);
            }
            left++;
        }
        return res;
    }
}