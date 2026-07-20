class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k=k%(m*n);
        int[] flat = new int[m*n];
        int index = 0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                flat[index++]=grid[i][j];
            }
        }

        int[] ans= new int[n*m];
        index=0;
        for(int i = n*m-k ; i <n*m ; i++){
            ans[index++]=flat[i];
        }
        for(int i = 0 ; i<n*m-k ; i++){
            ans[index++]=flat[i];
        }

        index = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i<m ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j<n ; j++){
                row.add(ans[index++]);
            }
            result.add(row);
        }
        return result;
    }
}