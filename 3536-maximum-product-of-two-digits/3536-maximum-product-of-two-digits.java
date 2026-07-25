class Solution {
    public int maxProduct(int n) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        while(n!=0){
            int rem = n%10;
            if(rem>first){
                second=Math.max(second,first);
                first=rem;
            }else{
                second=Math.max(second,rem);
            }
            n/=10;
        }
        return first*second;
    }
}