class Solution {
    static boolean valid(int[] position , int m , int min){
        int ball = 1 ;
        int pos = 0 ;
        for(int i = 0 ; i<position.length ; i++){
            if(position[i]-position[pos]>=min){
                ball++;
                pos = i;
                if(ball==m){
                    return true;
                }
            }
        }
        return false;
    }
    public int maxDistance(int[] position, int m){
        Arrays.sort(position);
        int n = position.length;
        int start = 0 ;
        int end = position[n-1]-position[0];
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(valid(position , m , mid)){
                ans=mid;
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return ans;
    }
}