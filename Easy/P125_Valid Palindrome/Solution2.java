class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        char ch[] = s.toCharArray();
        while(i<j){
            char c = lower(ch[i]);
            char d = lower(ch[j]);

            if(c==0){
                i++; continue;
            }

            if(d==0){
                j--; continue;
            }

            if(c!=d) return false;

            i++; j--;
            
        }

        return true;
    }

    private char lower(char c){
        if((c>='a' && c<='z') || (c>='0' && c<='9')) return c;

        if(c>='A' && c<='Z') return (char)('a' + c - 'A');

        return 0;
    }
}
