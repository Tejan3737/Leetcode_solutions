class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> ls = new ArrayList<>();
        for(int num : nums1){
            ls.add((double)num);
        }
        for(int num : nums2){
            ls.add((double)num);
        }
        Collections.sort(ls);
        int size = ls.size();
        int mid = (size-1)/2;
        if(size%2==0){
            return (ls.get(mid)+ls.get(mid+1))/2.0;
        }
        return ls.get(mid);
    }
}