

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i = n - 2; i >= 0; i--)
        {
            if (arr[i] != arr[n - 1])
            {
                return arr[i];
            }
        }
        
        return -1;
    }
}