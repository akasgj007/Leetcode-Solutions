class Solution {

    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String a = s.substring(0, n / 2);
        String b = s.substring(n / 2);
        int aCount = 0, bCount = 0, i = 0;
        while (i < a.length()) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);
            if (isVowel(ch1)) {
                aCount++;
            }
            if (isVowel(ch2)) {
                bCount++;
            }
            i++;
        }
        System.out.println(a + " " + b);
        return aCount == bCount;
    }
}
