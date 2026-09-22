class Solution {
    public int maximum69Number (int num) {
       int n[]=new int[4];
        for(int i=3;i>=0;i--){
            n[i]=num%10;
            num/=10;
        }
        for(int i=0;i<4;i++){
            if(n[i]==6){
                n[i]=9;
                break;
            }
        }
        int ans=0;
        for(int i=0;i<4;i++){
            ans=ans*10+n[i];

        }
         return ans;   
        
    }
}