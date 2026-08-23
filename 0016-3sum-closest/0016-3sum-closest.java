class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int psum=nums[0]+nums[1]+nums[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
        int k=nums.length-1;
            int j=i+1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(psum-target)>Math.abs(sum-target)){
                    psum=sum;
                }
                if(sum>target){
                    k--;

                }
                else if(sum<target){
                    j++;
                }
                else{
                    return target;
                }
                } 
                }
                return psum;
            }

        }
       