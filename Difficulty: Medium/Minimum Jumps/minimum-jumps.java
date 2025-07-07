class Solution {
    static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 0;
        int start = 0, end = 0;

        while (end < n - 1) {
            jumps++;
            int farthest = end;

            for (int i = start; i <= end; i++) {
                if (i + arr[i] > farthest) {
                    farthest = i + arr[i];
                }
            }

            if (farthest == end) return -1; // can't move forward
            start = end + 1;
            end = farthest;
        }

        return jumps;
    }
}
