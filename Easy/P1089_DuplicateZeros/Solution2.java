class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length-1;
        int zeros = 0;

        for(int i=0;i<=n-zeros;i++){
            if(arr[i]==0){
                //if 0 is in last element

                if(i == n-zeros){
                    //we need to copy the 0 not duplicate it

                    arr[n] = 0;
                    n = n-1;
                    break;
                }
                zeros++;
            }
        }

        int last = n-zeros;

        for(int i=last; i>=0;i--){
            if(arr[i] == 0){
                arr[i+zeros] = 0;
                zeros--;
                arr[i+zeros] = 0;
            }
            else{
                arr[i+zeros] = arr[i];
            }
        }
    }
}
