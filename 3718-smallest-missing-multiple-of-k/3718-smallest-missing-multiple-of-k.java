class Solution {
    public int missingMultiple(int[] nums, int k) {
        int multiple = k;
        while (contains(nums, multiple)) {
            multiple += k;
        }
        return multiple;
    }

    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}