class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count>0){
                    st.push('(');
                    
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    st.push(')');
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}