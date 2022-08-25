// method example

public class Add{
  
  //method = function
  public static int add(int a, int b) {
    int result;
    result = a + b;
    return result;
  }

  public static void show(String str) {
    System.out.println(str);
    System.out.println("------------------------");
  }

  public static void main(String[] args) {
    int[] num = {10,20,70,30,150,100,90};

    int m = add(10,15);
    System.out.println(m);
    System.out.println(add(20,30));
    int r = add(10, (int)10.5);
    System.out.println(add(num[1], num[2]));
    show("AP Java");
  }
}