class Swap {
    public static int printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
        System.out.println("---------");
        return n;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[ ] args) {
        int[] arr = {10,20,50,30,40,99};
        
        System.out.println("Hello Java");
        printArray(arr);
        swap(arr, 2, 5);
        printArray(arr);

    }
}