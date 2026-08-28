class Solution {
public:
    int singleNumber(vector<int>& nums) {
        bool unique;
        for(int i=0 ; i<nums.size();i++){
            unique=true;
            for(int j=0 ; j<nums.size();j++){
                if(i!=j && nums[i]==nums[j]){
                    unique=false;
                    break;
                }
            }
            if(unique==true){
                return nums[i];
            }
        }
       return {}; 
    }
};