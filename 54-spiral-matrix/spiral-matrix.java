import java.util.*;

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        int top = 0;
        int bottom = totalRows - 1;
        int left = 0;
        int right = totalCols - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }

            for (int row = top + 1; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }

            for (int col = right - 1; col >= left; col--) {

                if (top == bottom) {
                    break;
                }

                result.add(matrix[bottom][col]);
            }

            for (int row = bottom - 1; row >= top + 1; row--) {

                if (left == right) {
                    break;
                }

                result.add(matrix[row][left]);
            }

            top++;
            bottom--;
            left++;
            right--;
        }

        return result;
    }
}