class Solution {
    public int maxProduct(int n) {
        int temp=n;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        while(temp!=0){
            int mod=temp%10;
            if(mod>max){
                smax=max;
                max=mod;
            }
            else if(mod>smax){
                    smax=mod;
            }
            temp/=10;


        }
        return max*smax;
    }
}