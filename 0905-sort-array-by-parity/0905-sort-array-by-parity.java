class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]%2!=0){
                swap(nums,l,r);
                r--;
            }
            else{
                l++;

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