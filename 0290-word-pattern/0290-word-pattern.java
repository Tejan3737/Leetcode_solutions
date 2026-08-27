class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> one = new HashMap<>();
        HashMap<String,Character> second = new HashMap<>();
        String[] word = s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        for(int i = 0 ; i <pattern.length() ; i++){
            char c = pattern.charAt(i);
            String w = word[i];
            if(one.containsKey(c) && !one.get(c).equals(w)){
                return false;
            }
            if(second.containsKey(w) && second.get(w)!=c){
                return false;
            }
            one.put(c,w);
            second.put(w,c);
        }
        return true;
    }
}