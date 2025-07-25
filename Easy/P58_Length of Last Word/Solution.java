class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        boolean started = false;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                started = true;
                sb.append(ch);
                count++;
            }
            else if(started) break;
        }
        System.out.println(sb.reverse());
        return count;
    }
}
