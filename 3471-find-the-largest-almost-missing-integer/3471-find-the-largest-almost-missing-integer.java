class Solution {
    public int largestInteger(int[] nums, int k) {
        int start = 0 ;
        int end = k;
        int[] freq = new int[51]; 
        while(end<=nums.length){
            int[] visited = new int[51];
            for(int i = start ; i<end ; i++){
                if(visited[nums[i]]>=1){
                    continue;
                }
                visited[nums[i]]++;
                freq[nums[i]]++;
            }
            start++;
            end++;
        }
        int ans = -1;
        for(int i = 0 ; i<51 ; i++){
            if(freq[i]==1){
                ans = i;
            }
        }
        return ans;
    }
}