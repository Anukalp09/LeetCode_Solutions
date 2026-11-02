class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n=num_people;
        int res[]=new int[n];
        int i=0;
        int r=1;
        while(candies>0){
            int min=Math.min(r,candies);
            res[i%n]+=min;
            candies-=min;
            r++;
            i++;
        }
        return res;

    }
}