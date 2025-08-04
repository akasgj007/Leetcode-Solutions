//Using hashmap

class Solution {
    public String freqAlphabets(String s) {
        Map<String,Character> map = new HashMap<>();
        for(int i=1;i<=26;i++){
            char ch = (char) ('a'+i-1);
            if(i>=1 && i<=9){
                map.put(i+"",ch);
            }
            else{
                map.put(i+"#",ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            String curr = "";
            if(s.charAt(i)=='#'){
                curr = s.charAt(i-2)+""+s.charAt(i-1)+s.charAt(i);
                i-=2;
            }
            else{
                curr = s.charAt(i)+"";
            }
            sb.append(map.get(curr));
        }
        return sb.reverse().toString();
    }
}
