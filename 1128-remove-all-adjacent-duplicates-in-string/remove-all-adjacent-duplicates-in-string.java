class Solution {
    public String removeDuplicates(String s) {
         int l=s.length();
           Stack<Character> st=new Stack<>();

         String res="";
         
         for(int i=0;i<l;i++){
             if(!st.empty() && st.peek().equals(s.charAt(i))){
                 st.pop();
             }
             else{
                 st.push(s.charAt(i));
             }
         }
         
         for(Character ch:st)
         res+=ch;
         return res;
    }
}