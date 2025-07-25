class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int n : nums){
            if(getDigits(n)%2==0){
                res+=1;
            }
        }
        return res;
    }

    private int getDigits(int n){
        int digits = 0;
        while(n>0){
            int rem = n%10;
            digits+=1;
            n = n/10;
        }
        return digits;
    }
}
