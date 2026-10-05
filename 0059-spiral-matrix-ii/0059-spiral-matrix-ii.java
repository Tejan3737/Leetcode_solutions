class Solution {
    public int[][] generateMatrix(int n) {
        int scol = 0 , srow = 0 , ecol = n - 1 , erow = n - 1;
        int[][] ans = new int[n][n];
        int value = 1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol; i<=ecol; i++){
                ans[srow][i]=value++;
            }
            for(int i=srow+1 ; i<=erow ; i++){
                ans[i][ecol] = value++;
            }
            for(int i=ecol-1 ; i >= scol ; i--){
                if(srow==erow){
                    break;
                }
                ans[erow][i]=value++;
            }
            for(int i=erow-1 ; i > srow ; i--){
                if(scol==ecol){
                    break;
                }
                ans[i][scol]=value++;
            }
            ecol--;
            scol++;
            erow--;
            srow++;
        }
        return ans;
    }
}