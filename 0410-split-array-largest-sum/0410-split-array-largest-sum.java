class Solution {
    static boolean Valid(int arr[] , int k , int mid){
        int count = 1 ; 
        int total = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            if(total+arr[i]<=mid){
                total = total+arr[i];
            }else{
                count++;
                if(count>k || arr[i]>mid){
                    return false;
                }
                else{
                    total = 0;
                    total = total + arr[i];
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length ; 
        int s = 1 ;
        int sum = 0 ;
        for(int i = 0 ; i<n ; i++){
            sum+=nums[i];
        }
        int e = sum ;
        int ans = 0 ;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(Valid(nums, k , mid)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}