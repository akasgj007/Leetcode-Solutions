class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int dup[] = new int[n];
        int index = 0;
        for (int i = 0; i < n && index < n; i++) {
            if (arr[i] == 0) {
                index += 2;
            } else {
                dup[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = dup[i];
        }
    }
}
