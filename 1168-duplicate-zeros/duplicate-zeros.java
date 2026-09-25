class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        int length = n - 1;

        // 1. Count how many zeros fit into the original array bounds
        for (int left = 0; left <= length - zeros; left++) {
            if (arr[left] == 0) {
                // If a zero occurs at the edge, its duplicate will drop off
                if (left == length - zeros) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                zeros++;
            }
        }

        // 2. Shift backwards to avoid overwriting unread values
        int last = length - zeros;
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeros] = 0;
                zeros--;
                arr[i + zeros] = 0;
            } else {
                arr[i + zeros] = arr[i];
            }
        }
    }
}