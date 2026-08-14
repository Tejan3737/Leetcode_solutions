class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxlength =0;
        HashMap<Character,Integer> count = new HashMap<>();
        while(right<s.length()){
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while(count.get(ch)>2){
                char leftc = s.charAt(left);
                count.put(leftc , count.get(leftc)-1);
                left++;
            }
            maxlength = Math.max(maxlength,right-left+1);
            right++;
        }
        return maxlength;
    }
}