class Solution {
    public int maxRepeating(String sequence, String word) {
        if(word.length()>sequence.length()){
            return 0;}
            int count=0;
            StringBuilder sb=new StringBuilder(word);
            while(sequence.contains(sb.toString())){
                count++;
                sb.append(word);
            }
            return count;

        
    }
}