class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            int first = nums[i];
            int second = target-nums[i];
            if(hm.containsKey(second)){
                ans[1] = i;
                ans[0] = hm.get(second);
                return ans;
            }
            hm.put(first,i);
        }
        return ans;
    }
}