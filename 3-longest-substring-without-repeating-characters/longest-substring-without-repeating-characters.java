class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxi=0;
        Set<Character> ch=new HashSet<>();
        int l=0;
        for(int i=0;i<n;i++){
            if(!ch.contains(s.charAt(i))){
                ch.add(s.charAt(i));
                maxi=Math.max(maxi,i-l+1);
            }
            else{
                while(ch.contains(s.charAt(i))){
                    ch.remove(s.charAt(l));
                    l++;
                }
            }ch.add(s.charAt(i));
        }
        return maxi;
    }
}