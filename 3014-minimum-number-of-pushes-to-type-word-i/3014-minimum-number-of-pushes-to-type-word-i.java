class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n>=8 && n<16){
            return 8+(n-8)*2;
        }else if(n>=16 && n<24){
            return 8+(8)*2+(n-16)*3;
        }else if(n>=24){
            return 8+(8)*2+(8)*3+(n-24)*4;
        }
        return n;
    }
}