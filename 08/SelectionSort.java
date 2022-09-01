//Selection Sort

import java.util.Arrays;

public class SelectionSort
{
    
    // public static int findMax(int[] arr) {
    //     int max = arr[0];
    //     for(int i=1; i<arr.length; i++) {
    //         if(max < arr[i])
    //             max = arr[i];
    //     }
    //     return max;
    // }

    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = {55,45,80,90,10,40,35,50,30,70};
        int n = num.length;
        for(int i=0; i<n; i++) {
          int max = i;
          for(int j=n-1; j>i; j-- ) {
            if(num[i] < num[j])
              max = j;
          }
          if(max!=i) 
            swap(num, i, max);
        System.out.println(Arrays.toString(num));
        }
 }
}