import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
       
        int[] minFreq = new int[26];
        
        // Populate minFreq with the count of the first word
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }
        
        // Intersect counts with each subsequent word
        for (int i = 1; i < words.length; i++) {
            int[] charCount = new int[26];
            for (char c : words[i].toCharArray()) {
                charCount[c - 'a']++;
            }
            
            // Take the minimum frequency for each letter
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], charCount[j]);
            }
        }
        
        // Collect characters based on final min frequencies
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                minFreq[i]--;
            }
        }
        
        return result;
    }
}