class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
      if(target>x+y){
        return false;
      }
      int a=x;
      int b=y;

    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }      
    return target%a==0;
    }
}