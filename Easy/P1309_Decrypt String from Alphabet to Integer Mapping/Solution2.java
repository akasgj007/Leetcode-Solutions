class Solution {
    public String freqAlphabets(String s) {

        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            int num = 0;
            if (s.charAt(i) == '#') {
                num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                i -= 3;
            } else {
                num = (s.charAt(i) - '0');
                i--;
            }
            sb.append((char) (num + 96));

        }

        return sb.reverse().toString();
    }
}
