class Solution {
    public boolean checkValidString(String s) {
        int left = 0;
        int star = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                left++;
                star++;
            }

            if (s.charAt(i) == ')') {
                left--;
                star--;
            }

            if (s.charAt(i) == '*') {
                left--;
                star++;
            }

            if (star < 0) {
                return false;
            }

            if (left < 0) {
                left = 0;
            }
        }

        return left == 0;
    }
}