class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+1];
        for(int i : nums){
            if(i>0 && i<=n){
                arr[i]++;
            }
        }
        for(int i = 1 ; i<n+1 ; i++){
            if(arr[i]==0){
                return i;
            }
        }
        return n+1;
    }
}