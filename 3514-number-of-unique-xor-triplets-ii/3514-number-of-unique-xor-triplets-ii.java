class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set <Integer> pair = new HashSet<>();
        Set <Integer> answer = new HashSet<>();
        int n = nums.length;
        for(int j = 0 ; j < n ; j++){
            answer.add(nums[j]);
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                pair.add(nums[i]^nums[j]);
            }
        }
        for(int i : pair){
            for(int j : nums){
                answer.add(i^j);
            }
        }
        return answer.size();
    }
}