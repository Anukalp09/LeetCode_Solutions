class Solution {
    public long countCommas(long n) {
        long current=1000;
        long result=0;
        while(current<=n){
            result=result+n-current+1;
            current=current*1000;
        }
        return result;
    }
}