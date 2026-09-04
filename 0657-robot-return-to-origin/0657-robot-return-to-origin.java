class Solution {
    public boolean judgeCircle(String moves) {

        int uCount=0;
        int dCount=0;
        int rCount=0;
        int lCount=0;


        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);

            if(ch == 'U'){
                uCount++;
            }
            else if(ch == 'D'){
                dCount++;
            }
            else if(ch == 'R'){
               rCount++;
            }
            else if(ch == 'L'){
                lCount++;
            }
        }

       
        return (uCount==dCount && rCount==lCount);
    }
}