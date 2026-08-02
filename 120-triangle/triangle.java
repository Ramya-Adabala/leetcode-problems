class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n=t.size();
        int dp[][]=new int[n][n];
        int i=n-1;
        for(int j=0;j<n;j++){
            dp[i][j]=t.get(i).get(j);
        }
        for(int x=n-2;x>=0;x--){
            for(int y=0;y<=x;y++){
                dp[x][y]=Math.min((t.get(x).get(y)+dp[x+1][y]),
                (t.get(x).get(y)+dp[x+1][y+1]));
            }
        }
        return dp[0][0];
    }
}