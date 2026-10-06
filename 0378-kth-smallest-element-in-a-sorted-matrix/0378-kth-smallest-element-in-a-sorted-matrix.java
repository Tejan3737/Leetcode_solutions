class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int start = matrix[0][0];
        int end = matrix[n - 1][n - 1];

        while (start < end) {

            int mid = start + (end - start) / 2;

            int count = 0;

            int row = 0;
            int col = n - 1;

            while (row < n && col >= 0) {

                if (matrix[row][col] <= mid) {
                    count += col + 1;
                    row++;
                } 
                else {
                    col--;
                }
            }
            if (count < k) {
                start = mid + 1;
            } 
            else {
                end = mid;
            }
        }

        return start;
    }
}