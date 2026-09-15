class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int roman[]=new int[128];
        roman['I']=1;
        roman['V']=5;
        roman['X']=10;
        roman['L']=50;
        roman['C']=100;
        roman['D']=500;
        roman['M']=1000;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(roman[ch]<roman[s.charAt(i+1)]){
                ans-=roman[ch];
            }
            else{
                ans+=roman[ch];
            }
        }
        ans+=roman[s.charAt(s.length()-1)];
        return ans;
    }
}