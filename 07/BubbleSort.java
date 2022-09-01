import java.util.Arrays;
public class BubbleSort {

  public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for(int j=n-1; j>0; j-- ){
      for(int i=0; i<j; i++) {
        if(arr[i] > arr[i+1])
          swap( arr, i, i+1);
      System.out.println(Arrays.toString(arr));
      }
      System.out.println("--------");
    }
  }

  public static void main(String[] args) {
    int[] arr = {20,50,30,10,40,80,70,100,90};
    bubbleSort(arr);
    // System.out.println(Arrays.toString(arr));
  }
}