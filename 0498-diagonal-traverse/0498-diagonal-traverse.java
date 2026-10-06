class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m * n];

        int row = 0;
        int col = 0;
        int index = 0;

        boolean up = true;

        while (index < m * n) {

            if (up) {

                while (row >= 0 && col < n) {
                    ans[index++] = mat[row][col];

                    row--;
                    col++;
                }

                if (col == n) {
                    row += 2;
                    col--;
                } 
                else {
                    row++;
                }

            } else {

                while (row < m && col >= 0) {
                    ans[index++] = mat[row][col];

                    row++;
                    col--;
                }

                if (row == m) {
                    row--;
                    col += 2;
                } 
                else {
                    col++;
                }
            }
            up = !up;
        }

        return ans;
    }
}