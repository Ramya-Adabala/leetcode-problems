class Solution {
    public int mySqrt(int x) {
     int start=1,end=x/2;
     if(x==0) return 0;
     if(x==1) return 1;
     int res=1;
     while(start<=end){
        int m=start+(end-start)/2;
        long sqrt=(long) m*m;
        if(x==sqrt) return m;
        else if(sqrt<x){
            start=m+1;
            res=m;
        }
        else end=m-1;
     }
     return res;
    }
}