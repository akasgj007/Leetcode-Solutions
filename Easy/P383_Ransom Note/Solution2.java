//Solution 2 : Using Char Array


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLen = ransomNote.length();
        int mLen = magazine.length();

        if(mLen < rLen) return false;
        
        int alpha[] = new int[26]; 

        for(char m : magazine.toCharArray()){
            alpha[m - 'a']++;
        }

        for(char r : ransomNote.toCharArray()){
           if(alpha[r - 'a'] == 0) return false;

            alpha[r - 'a']--;
        }

        return true;
    }
}
