class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> one = new HashMap<>();
        HashMap<Character,Character> second = new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0 ; i <s.length() ; i++){
            char c = s.charAt(i);
            char w = t.charAt(i);
            if(one.containsKey(c) && one.get(c)!=w){
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