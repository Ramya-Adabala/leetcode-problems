class Solution {
    public int reverse(int x) {
        int rem=0;
        double rev=0;
        while(x!=0){
             rem=x%10;
             rev=rev*10+rem;
             x=x/10;
        }
        if(rev<=Integer.MAX_VALUE && rev>=Integer.MIN_VALUE){
            int res=(int) rev;
            return res;
        }
        return 0;
    }
}