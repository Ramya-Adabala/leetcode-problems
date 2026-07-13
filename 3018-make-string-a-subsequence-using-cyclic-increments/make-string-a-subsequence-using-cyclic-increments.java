class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        int i=0,j=0;
        while(i<m && j<n){
            char ch1=str1.charAt(i);
            char ch2=str2.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
                char ch3= ch1=='z'?'a':(char) (ch1+1);
                if(ch2==ch3){
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
        }
        return j==n;
    }
}