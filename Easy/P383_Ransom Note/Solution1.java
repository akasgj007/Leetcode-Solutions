//Solution 1: Using HashMap

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rLen = ransomNote.length();
        int mLen = magazine.length();

        if(mLen < rLen) return false;
        
        Map<Character,Integer> map = new HashMap<>();

        for(char m : magazine.toCharArray()){
            map.put(m,map.getOrDefault(m,0)+1);
        }

        for(char r : ransomNote.toCharArray()){
            if(map.getOrDefault(r,0) < 1){
                return false;
            }
            else{
                map.put(r, map.get(r)-1);
            }
        }

        return true;
    }
}

