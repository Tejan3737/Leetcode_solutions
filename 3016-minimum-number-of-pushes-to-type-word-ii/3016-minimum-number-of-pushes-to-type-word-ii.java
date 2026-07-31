class Solution {
    public int minimumPushes(String word) {
        char[] words = word.toCharArray();
        int[] grid = new int[26];
        int count=0;
        for(char i:words){
            grid[(int)i-'a']++;
            count++;
        }
        Arrays.sort(grid);
        count = 1;
        int press = 1;
        int ans=0;
        for(int i = grid.length-1 ; i>=0 ; i--){
            ans+=grid[i]*press;
            count++;
            if(count>8){
                press++;
                count=1;
            }
        }
        return ans;
    }
}