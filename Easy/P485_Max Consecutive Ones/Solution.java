class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int n : nums){
            if(n==1){
                count++;
                max = (max > count)? max : count;
            }
            else{
                count = 0;
            }
            // System.out.println(n+" - count : "+count+" - max : "+max);
        }
        return max;
    }
}
