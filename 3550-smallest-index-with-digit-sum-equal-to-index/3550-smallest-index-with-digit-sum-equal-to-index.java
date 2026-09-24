class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
           if(addDigits(nums[i])==i){
            return i;
           }
        }
        return -1;
    }
      public int addDigits(int num) {
             int sum=0;
            while (num > 0) {
               sum += num % 10;   
                num = num / 10;    
            }

            num = sum;  
        

        return num;
    }

    }
