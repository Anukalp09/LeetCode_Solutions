class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        int sorted[] = heights.clone();
        Arrays.sort(sorted);
        String[] res = new String[names.length];
        for (int i = 0; i < sorted.length; i++) {
            res[i] = map.get(sorted[sorted.length - 1 - i]);
        }
        return res;
    }
}