class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s==null || s.length==0) return "";
        String pref=s[0];
         int preflen=pref.length();
         for(int i=1;i<s.length;i++){
            String st=s[i];
            while(preflen>st.length() || !pref.equals(st.substring(0,preflen))){
                preflen--;
                if(preflen==0) return "";
                pref=pref.substring(0,preflen);
            }
         }
         return pref;
    }
}