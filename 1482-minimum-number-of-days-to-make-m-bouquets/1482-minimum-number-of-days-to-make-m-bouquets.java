class Solution {
    public int count(int[] bloomDay , int day , int flowers){
        int count = 0;
        int subcount = 0;
        for(int bd : bloomDay){
            if(bd<=day){
                subcount++;
                if(subcount==flowers){
                    subcount=0;
                    count++;
                }
            }else{
                subcount=0;
            }
        }
        return count;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        int start = 0 ;
        int end = bloomDay[0];
        int ans = -1;
        for(int i = 0 ; i < bloomDay.length ; i++){
            end=Math.max(bloomDay[i],end);
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            int bouquet = count(bloomDay,mid , k );
            if(bouquet>=m){
                end = mid - 1;
                ans = mid;
            }else if(bouquet<m){
                start = mid+1;
            }
        }
        return ans;
    }
}