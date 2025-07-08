// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) {
            minHeap.add(num);
        }
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
    
}
