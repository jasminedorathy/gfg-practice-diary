import java.util.*;
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d % n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
        
        static void reverse(int arr[],int start, int end){
            while(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
                
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            
            int d = sc.nextInt();
            rotateArr(arr,d);
            
            for(int i : arr)
            {
                System.out.print(i + " ");
            }
        }
    }