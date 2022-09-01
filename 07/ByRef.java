import java.util.Arrays;


class MyVar {
  int x = 10;
  int y = 20;
}

class ByRef {

  public static void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args){
    int[] arr1 = {10,20,30,40,50};
    int[] arr2; 
    arr2 = arr1;
    printArray(arr2);
    arr2[2] = 99;
    printArray(arr1);
    MyVar v1 = new MyVar();
    MyVar v2;
    System.out.println(v1.x);
    v2 = v1;
    v1.x = 77;
    System.out.println(v2.x);

  }
}