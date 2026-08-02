class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int moving = 0 ; 
        int end = nums.length-1;
        while(moving<=end){
            if(nums[moving]==0){
                int temp = nums[start];
                nums[start] = nums[moving];
                nums[moving]=temp;
                moving++;
                start++;
            }
            else if(nums[moving]==1){
                 moving++;
            }
            else{
                int temp = nums[end];
                nums[end] = nums[moving];
                nums[moving]=temp;
                end--;
            }
        }

    }
}