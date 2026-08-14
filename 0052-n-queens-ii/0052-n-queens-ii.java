class Solution {
    boolean safe(ArrayList<String> board , int row , int col , int n){
        for(int i = 0 ; i<n ; i++){
            if(board.get(i).charAt(col)=='Q'){
                return false;
            }
            if(board.get(row).charAt(i)=='Q'){
                return false;
            }
        }
        for(int i = row , j=col ; i>=0 && j>=0 ; j-- , i--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        for(int i = row , j=col ; i>=0 && j<n ; j++ , i--){
            if(board.get(i).charAt(j)=='Q'){
                return false;
            }
        }
        return true;
    }

    void solve(ArrayList<String> board , int row , int n , List<List<String>> ans){
        if(row==n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int i = 0 ; i<n ; i++){
            if(safe(board , row , i , n)){
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(i,'Q');
                board.set(row , sb.toString());
                solve(board, row+1 , n , ans);
                sb.setCharAt(i,'.');
                board.set(row , sb.toString());
            }
        }
    }

    public int totalNQueens(int n) {
        ArrayList<String> board = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            board.add(".".repeat(n));
        }
        List<List<String>> ans = new ArrayList<>();
        
        solve(board , 0 , n , ans);
        return ans.size();
    }
}