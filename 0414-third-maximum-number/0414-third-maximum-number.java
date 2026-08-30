class Solution {
    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        int count = 0;

        for (int num : nums) {

            if (num == first || num == second || num == third) {
                continue;
            }

            count++;

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }

        if (count < 3) {
            return (int) first;
        }

        return (int) third;
    }
}