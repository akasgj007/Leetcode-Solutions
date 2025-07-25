//Solution 1 : Time complexity - O(n) 

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int l=0, r=n-1;
        for(int j=n-1;j>=0;j--){
            int sq;
            int absL = Math.abs(nums[l]);
            int absR = Math.abs(nums[r]);
            if(absL < absR){
                sq = nums[r] * nums[r];
                r--;
            }
            else{
                sq = nums[l] * nums[l];
                l++;
            }
            res[j] = sq;
        }

        return res;
    }
}
