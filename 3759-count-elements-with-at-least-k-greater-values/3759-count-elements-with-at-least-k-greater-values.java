class Solution {
    public int countElements(int[] nums, int k) {
        if(k==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int n = nums[nums.length-k];
        int ans = 0;
        for(int i : nums){
            if(i<n){
                ans++;
            }
        }
        return ans;
    }
}