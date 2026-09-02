class Solution {
    public int maxAscendingSum(int[] nums) {
      int curr=nums[0];
      int res=nums[0];
      for(int i=1;i<nums.length;i++){
        if(nums[i-1]<nums[i]){
        curr=Math.max(nums[i],curr+nums[i]);
        }
        else{
            curr=nums[i];
        }
        res=Math.max(res,curr);
      }  
      return res;
    }
}