class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int product=1;
        while(n!=0){
            int mod=n%10;
            sum+=mod;
            product*=mod;
            n/=10;
        }
        return temp%(sum+product)==0;
    }
}