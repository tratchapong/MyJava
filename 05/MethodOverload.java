// method overload example..

class MethodOverload {

static int plusMethod(int x) {
  return x + 10;
}

static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8);
  double myNum2 = plusMethod(4.3, myNum1);
  int mynum3 = plusMethod((int)4.3, myNum1);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
}