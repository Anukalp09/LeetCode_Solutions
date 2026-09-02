class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int freq = 0;

        for (int right = 0; right < nums.length; right++) {
            if (left == 0 || nums[right] != nums[left - 1]) {
                freq = 1;               
                nums[left] = nums[right];  
                left++;
            } else {
                freq++;
                if (freq <= 2) {
                    nums[left] = nums[right];  
                    left++;
                }
               
            }
        }
        return left;
    }
}