class Solution {
    public String smallestPalindrome(String s) {
        int[] grid = new int[26];
        for(char ch : s.toCharArray()){
            grid[(ch-'a')]++;
        }

        StringBuilder first = new StringBuilder();
        String second = "";

        for(int i = 0 ; i<26 ; i++){
            int count = grid[i];

            for(int j = 0 ; j<count/2 ; j++){
                first.append((char)(i+'a'));
            }
            if(count%2==1 && second.isEmpty()){
                second=String.valueOf((char) (i + 'a'));
            }
        }
        String one = first.toString();
        String third = first.reverse().toString();
        return one+second+third;
    }
}