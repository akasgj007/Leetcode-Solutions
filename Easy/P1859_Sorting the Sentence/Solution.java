class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String res[] = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            int n = str.length()-1;
            int j = (int) str.charAt(n) - '0';
            // System.out.println(j);
            res[j-1] = str.substring(0,n);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length;i++){
            sb.append(res[i]);
            if(i!=res.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}
