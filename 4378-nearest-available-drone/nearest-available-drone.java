class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int m = drones.length;
        int minDistance = Integer.MAX_VALUE;
        int ansIndex = -1;

        for (int i = 0; i < m; i++) {
            int x = drones[i][0];
            int y = drones[i][1];
            int range = drones[i][2];

            int dist = Math.abs(x - target[0]) + Math.abs(y - target[1]);

            if (dist <= range) {
                if (dist < minDistance) {
                    minDistance = dist;
                    ansIndex = i;
                }
            }
        }

        return ansIndex;
    }
}