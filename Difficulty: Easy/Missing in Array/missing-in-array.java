class Solution {
    int missingNum(int arr[]) {
        int n = arr.length+1;
        long totsum = ((long) n*(n + 1))/2;
        long sum = 0;
        for(int i=0;i<n-1;i++){
            sum += arr[i];
        }
        return (int) (totsum-sum);
    }
}