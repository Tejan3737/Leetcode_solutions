class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i:nums1){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        int index = 0;
        for(int i:nums2){
            if (hm.containsKey(i)) {
                ans[index++] = i;
                hm.remove(i);
            }
        }
        return Arrays.copyOf(ans , index);
    }
}