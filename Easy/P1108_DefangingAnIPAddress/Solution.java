class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char ch : address.toCharArray()){
            if(ch!='.') sb.append(ch);
            else{
                sb.append('[');
                sb.append('.');
                sb.append(']');
            }
        }

        return sb.toString();
    }
}
