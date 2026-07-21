class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        
        int sum=0;
        int en=n-1;
        int st=0;
        int lmax=0 ,rmax =0 ;
        while(st<en){
            lmax=max(lmax,height[st]);
            rmax=max(rmax,height[en]);
            if(lmax<rmax){
                sum+= lmax-height[st];
                st++;
            }else{
                sum+= rmax-height[en];
                en--;
            }
        }
        return sum;
    }
};