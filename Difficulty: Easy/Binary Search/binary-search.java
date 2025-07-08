class Solution {
    public int binarysearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int res = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                res = mid;         // Found k, store index
                high = mid - 1;    // Look for earlier occurrence
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return res;
    }
}
