import java.util.*;
class Solution {

    private List<Integer> generateRow(int rowNumber) {

        List<Integer> row = new ArrayList<>();

        long value = 1;
        row.add(1);

        for (int column = 1; column < rowNumber; column++) {

            value = value * (rowNumber - column);
            value = value / column;

            row.add((int) value);
        }

        return row;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {
            triangle.add(generateRow(row));
        }

        return triangle;
    }
}