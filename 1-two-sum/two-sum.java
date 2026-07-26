class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
      
           int x=nums[i];
           int y=target-nums[i];
           if(hm.containsKey(y))
           return new int[]{hm.get(y),i};
    
    hm.put(nums[i],i);}
    return new int[]{-1,-1};}
}