class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0;
        int en = nums.length - 1;

        while (st < en) {
            int mid = st + (en - st) / 2;

            if (nums[mid] > nums[mid + 1]) {
                en = mid;
            } else {
                st = mid + 1;
            }
        }

        return st;
    }
}