class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(i%2==0 && nums[i]%2!=0){
                while(nums[j]%2!=0)j=j+2;
                swap(nums,i,j);
                
            }

        }
        return nums;

    }
    private void swap(int arr[],int a,int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}