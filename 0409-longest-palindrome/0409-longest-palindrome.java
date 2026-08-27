class Solution {
    public int longestPalindrome(String s) {
        int count  = 1 ;
        int sum = 0;
        if(s.length()==1){
            return 1;
        }
        char[] ch = s.toCharArray();
        int[] freq = new int[128];
        for(char c : ch){
            freq[c]++;
        }
        boolean odd = false;
        for(int i : freq){
            sum+=(i/2)*2;
            if(i%2!=0){
                odd=true;
            }
            System.out.println(i +" ");
        }
        if(odd){
            sum++;
        }
        return sum;
    }
}