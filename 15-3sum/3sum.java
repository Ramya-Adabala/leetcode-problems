class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> li=new ArrayList<>();
       int target=0;
       Arrays.sort(nums);
       int n=nums.length;
      for(int i=0;i<n-2;i++){
        if(i>0 &&nums[i]==nums[i-1]) continue;
        int l=i+1,r=n-1;
       while(l<r){
        int sum=nums[i]+nums[l]+nums[r];
        if(sum==target) {
            li.add(Arrays.asList(nums[i],nums[l],nums[r]));
            while(l<r&& nums[l]==nums[l+1]) l++;
            while(l<r && nums[r]==nums[r-1]) r--;
            l++;r--;
            }
        else if(sum>target) r--;
        else {
            l++;
        }

       }}
       return li;
    }
}