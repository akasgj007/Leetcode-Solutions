class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(int i=0;i<patterns.length;i++){
            int n = word.indexOf(patterns[i]);
            // System.out.println(n);
            if(n>=0) count++;
        }
        return count;
    }
}
