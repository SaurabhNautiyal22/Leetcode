class Solution {

    private boolean isValid(int[][] grid,
                            int row,
                            int col,
                            int size,
                            int expectedValue) {
        if (row < 0 || col < 0 ||
            row >= size || col >= size ||
            grid[row][col] != expectedValue) {
            return false;
        }

        if (expectedValue == size * size - 1) {
            return true;
        }

        boolean move1 = isValid(grid, row - 2, col + 1, size, expectedValue + 1);
        boolean move2 = isValid(grid, row - 1, col + 2, size, expectedValue + 1);
        boolean move3 = isValid(grid, row + 1, col + 2, size, expectedValue + 1);
        boolean move4 = isValid(grid, row + 2, col + 1, size, expectedValue + 1);
        boolean move5 = isValid(grid, row + 2, col - 1, size, expectedValue + 1);
        boolean move6 = isValid(grid, row + 1, col - 2, size, expectedValue + 1);
        boolean move7 = isValid(grid, row - 1, col - 2, size, expectedValue + 1);
        boolean move8 = isValid(grid, row - 2, col - 1, size, expectedValue + 1);

        return move1 || move2 || move3 || move4 ||
               move5 || move6 || move7 || move8;
    }

    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid, 0, 0, grid.length, 0);
    }
}