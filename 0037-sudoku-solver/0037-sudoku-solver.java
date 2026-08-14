class Solution {
    boolean check(char[][] board , int row , int col , int dig){
        for(int i = 0 ; i<9 ; i++){
            if(board[row][i]==dig || board[i][col]==dig){
                return false;
            }
        }
        int x = (row/3)*3;
        int y = (col/3)*3;
        for(int i = x ; i<x+3 ; i++){
            for(int j = y ; j<y+3 ; j++){
                if(board[i][j]==dig){
                    return false;
                }
            }
        }
        return true;
    }
    boolean solve(char[][] board , int row , int col){
        if(row==9){
            return true;
        }
        int nextr=row;
        int nextc=col+1;
        if(nextc==9){
            nextr=row+1;
            nextc=0;
        }
        if(board[row][col]!='.'){
            return solve(board,nextr,nextc);
        }
        for(char i = '1' ; i<='9' ; i++){
            if(check(board,row,col,i)){
                board[row][col]=i;
                if(solve(board,nextr,nextc)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board , 0 , 0);
    }
}