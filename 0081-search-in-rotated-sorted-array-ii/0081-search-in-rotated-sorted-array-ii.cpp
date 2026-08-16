class Solution {
public:
    bool search(vector<int>& nums, int target) {
        int n=nums.size();
        int st=0, en=n-1;
        while(st<=en){
            int mid= st+(en-st)/2;
            if(nums[mid]==target){
              return true;
            }
            if (nums[st] == nums[mid] && nums[mid] == nums[en]) {
                st++;
                en--;
            }

            else if(nums[st]>nums[mid]){
                if(nums[en]>=target && nums[mid]<target){
                    st=mid+1;
                }else{
                    en=mid-1;
                }

            }else{
                if(nums[st]<=target && nums[mid]>target){
                    en=mid-1;
                }else{
                    st=mid+1;
                }
            }

        }
        return false;
    }
};