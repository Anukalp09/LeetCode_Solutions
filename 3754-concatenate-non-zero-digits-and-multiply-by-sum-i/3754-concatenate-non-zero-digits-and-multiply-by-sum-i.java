class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        while(n!=0){
           long mod=n%10;
           if(mod!=0){
            sum+=mod;
            x=x*10+mod;
           }
            n/=10;
        }
        long rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        return rev*sum;


    }
}