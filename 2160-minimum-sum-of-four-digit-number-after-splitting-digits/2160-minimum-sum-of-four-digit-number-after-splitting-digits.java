class Solution {
    public int minimumSum(int num) {
        int min=10;
        int smin=20;
        int sum=0;
        while(num!=0){
            int digit=num%10;
            if(digit<min){
                smin=min;
                min=digit;
            }
            else if(digit<smin){
                smin=digit;
            }
            sum+=digit;
            num/=10;
        }
        int ans=10*min+10*smin+(sum-smin-min);
        return ans;


    }
}