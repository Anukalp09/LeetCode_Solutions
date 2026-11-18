class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> first = new Stack<>();
        Stack <Character> second = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                first.push(c);
            }
            else if(!first.isEmpty()){
                first.pop();
            }
        }
        for(char c:t.toCharArray()){
            if(c!='#'){
                second.push(c);

            }
            else if(!second.isEmpty()){
                second.pop();
            }
        }
        return first.equals(second);

    }
}