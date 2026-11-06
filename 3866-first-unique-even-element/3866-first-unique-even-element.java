class Solution {
    public int firstUniqueEven(int[] nums) {
        int count[]=new int[101];
        for(int n:nums){
            count[n]++;
        }
        for(int n:nums){
            if(n%2==0 && count[n]==1){
                return n;
            }
        }
        return -1;
    }
}