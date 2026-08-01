class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        int res=nums.length;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=target){
                res=mid;
                h=mid-1;
            }
            
                else l=mid+1;
            
        }
        return res;
    }
}