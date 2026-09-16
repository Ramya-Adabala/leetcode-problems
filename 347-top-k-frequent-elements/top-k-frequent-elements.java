import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
       ArrayList<Map.Entry<Integer,Integer>> al =
                new ArrayList<>(hm.entrySet());
       al.sort((a,b)->b.getValue()-a.getValue());
       int last[]=new int[k];
       for(int i=0;i<k;i++){
        last[i]=al.get(i).getKey();       }
return last;
        }
    
}