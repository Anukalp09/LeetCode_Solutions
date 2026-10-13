class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long temp[]=new long[n];
        for(int i=0;i<n;i++){
            temp[i]=(long) nums[i]*nums[i];
        }
        Arrays.sort(temp);
        long ans=0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                ans-=temp[i];
                }
                else{
                ans+=temp[i];
                }
        }
        return ans;
    }
}