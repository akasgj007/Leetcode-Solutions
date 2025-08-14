class Solution {
    public String largestGoodInteger(String num) {
        String triplets[] = {
            "999","888","777","666","555",
            "444","333","222","111","000"
        };

        for(String triple : triplets){
            // System.out.println(triple+" : "+num);
            // System.out.println(num.indexOf(triple));
            if(num.indexOf(triple) >= 0) return triple;
        }

        return "";    }
}
