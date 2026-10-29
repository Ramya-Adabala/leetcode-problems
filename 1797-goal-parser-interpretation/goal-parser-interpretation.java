class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=command.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            else if(ch=='(' && command.charAt(i+1)==')'){
                sb.append('o');
            }
        }
        return sb.toString();
    }
}