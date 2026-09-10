class Solution {
    public String stringHash(String s, int k) {

        String result = "";

        for (int i = 0; i < s.length(); i += k) {

            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += s.charAt(j) - 'a';
            }

            int hashed = sum % 26;

            result += (char) ('a' + hashed);
        }

        return result;
    }
}