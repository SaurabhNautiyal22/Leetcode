class Solution {

    public void rotate(int[][] matrix) {

        int size = matrix.length;

        for (int row = 0; row < size - 1; row++) {

            for (int col = row + 1; col < size; col++) {

                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        for (int row = 0; row < size; row++) {

            int left = 0;
            int right = size - 1;

            while (left < right) {

                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;

                left++;
                right--;
            }
        }
    }
}