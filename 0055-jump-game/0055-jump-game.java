class Solution {
    public boolean canJump(int[] nums) {
      
        int rec=0;
        for(int i=0;i<nums.length;i++){
            if(rec<i){
                return false;
            }
            int max=i+nums[i];
            rec=Math.max(rec,max);
        }
        return true;
        
    }
}