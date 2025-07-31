class Solution {
    public int lengthOfLastWord(String s) {
        int n =-0;
        boolean started = false;

        for(int i=s.length()-1;i>0;i--){
            char ch = s.charAt(i);
            if(ch != ' '){
                started = true;
                n+=1;
            }
            else if(started) break;
        }
        return n;
    }
}
