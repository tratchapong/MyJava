import java.util.Arrays;

class Swap {

    public static void printArray(int[] arr) {
      System.out.println(Arrays.toString(arr));
    }

    public static void swap1(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] swap2(int[] arr, int i, int j) {
        int[] res = new int[arr.length];
        for(int a=0; a<res.length; a++)
          res[a] = arr[a];
        int temp = res[i];
        res[i] = res[j];
        res[j] = temp;
        return res;
     }

    public static void main(String[ ] args) {
        int[] arr = {10,20,50,30,40,99};
        
        System.out.println("Hello Java");
        printArray(arr);
        swap1(arr, 2, 5);
        printArray(arr);

    }
}