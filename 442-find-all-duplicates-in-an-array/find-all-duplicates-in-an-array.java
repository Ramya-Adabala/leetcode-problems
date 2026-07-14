class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> obj=new LinkedHashMap<>();
        for(int n:nums){
            obj.put(n,obj.getOrDefault(n,0)+1);

        }
        List<Integer> l=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : obj.entrySet()){
        if(entry.getValue()==2){
       
        l.add(entry.getKey());
    }}
    return l;}
}