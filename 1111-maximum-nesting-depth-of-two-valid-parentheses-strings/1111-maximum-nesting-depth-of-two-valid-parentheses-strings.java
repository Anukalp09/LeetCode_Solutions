class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int temp=0;
        int res[]=new int[seq.length()];
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='('){
                temp++;
                res[i]=temp%2;

            }
            else{
                res[i]=temp%2;
                temp--;

            }
        }
        return res;
    }
}