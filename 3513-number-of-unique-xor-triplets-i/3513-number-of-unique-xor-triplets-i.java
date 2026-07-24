class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        if(n<=2){
            return 1 << bits - 1;
        }
        return 1 << bits;
    }
}
