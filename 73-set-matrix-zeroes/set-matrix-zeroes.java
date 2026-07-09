class Solution {

    public void setZeroes(int[][] matrix) {

        int rowCount = matrix.length;
        int colCount = matrix[0].length;

        int firstColumn = 1;

        for (int row = 0; row < rowCount; row++) {

            for (int col = 0; col < colCount; col++) {

                if (matrix[row][col] == 0) {

                    matrix[row][0] = 0;

                    if (col != 0) {
                        matrix[0][col] = 0;
                    } else {
                        firstColumn = 0;
                    }
                }
            }
        }

        for (int row = 1; row < rowCount; row++) {

            for (int col = 1; col < colCount; col++) {

                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }

        if (matrix[0][0] == 0) {

            for (int col = 0; col < colCount; col++) {
                matrix[0][col] = 0;
            }
        }

        if (firstColumn == 0) {

            for (int row = 0; row < rowCount; row++) {
                matrix[row][0] = 0;
            }
        }
    }
}