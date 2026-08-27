class Solution {
    public char findTheDifference(String s, String t) {
        int[] one = new int[26];
        int[] two = new int[26];
        for(char c : s.toCharArray()){
            one[c-'a']++;
        }
        for(char c : t.toCharArray()){
            two[c-'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(two[i]!=one[i]){
                return (char)(i+'a');
            }
        }
        return ' ';
    }
}