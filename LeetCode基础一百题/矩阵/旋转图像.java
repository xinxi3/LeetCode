package 矩阵;
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        while (top <= bottom) {
            for (int i = 0; i < right - left; i++) {
                int temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }
            top++;
            bottom--;
            left++;
            right--;
        }
    }
}