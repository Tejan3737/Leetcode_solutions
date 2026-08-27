class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        while(n!=1){
            int x = n;
            n=0;
            while (x > 0) {
                int digit = x % 10;
                n += digit * digit;
                x /= 10;
            }
            System.out.print(n+" ");
            if(hm.containsKey(n)){
                return false;
            }else{
                hm.put(n,1);
            }
        }
        return true;
    }
}