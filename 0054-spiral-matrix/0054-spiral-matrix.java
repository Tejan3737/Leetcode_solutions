class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int scol = 0 , srow = 0 , ecol = matrix[0].length - 1 , erow = matrix.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(srow<=erow && scol<=ecol){
            for(int i=scol; i<=ecol; i++){
                ans.add(matrix[srow][i]);
            }
            for(int i=srow+1 ; i<=erow ; i++){
                ans.add(matrix[i][ecol]);
            }
            for(int i=ecol-1 ; i >= scol ; i--){
                if(srow==erow){
                    break;
                }
                ans.add(matrix[erow][i]);
            }
            for(int i=erow-1 ; i > srow ; i--){
                if(scol==ecol){
                    break;
                }
                ans.add(matrix[i][scol]);
            }
            ecol--;
            scol++;
            erow--;
            srow++;
        }
        return ans;
    }
}