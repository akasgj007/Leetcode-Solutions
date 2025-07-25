class Solution {
    public int reverse(int x) {
       
       int res = 0, tempres = 0;

       while(x!=0){
         int last_digit = x%10;
         tempres = (res*10) + last_digit;
         if(res != ((tempres - last_digit)/10)) return 0;
         res = tempres; 
         x = x/10;
         
       }

       return res;
        
    }
}
