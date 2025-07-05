// User function Template for Java

// class Solution {
//     // Function to count inversions in the array.
//     static int inversionCount(int arr[]) {
//         // Your Code Here
//         int count = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]) count++;
//                 //else count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public static int inversionCount(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    static int mergeSort(int[] arr, int[] temp, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            invCount += mergeSort(arr, temp, left, mid);
            invCount += mergeSort(arr, temp, mid + 1, right);
            invCount += merge(arr, temp, left, mid, right);
        }
        return invCount;
    }

    static int merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left, invCount = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        for (i = left; i <= right; i++) arr[i] = temp[i];
        return invCount;
    }
}
