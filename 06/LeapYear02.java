import java.util.Scanner;

public class LeapYear02 {

  public static boolean isLeap(int year) {
    return ( (year%100 !=0 && year%4 == 0) || year%400 == 0 ); 
  }

  public static int input(String msg) {
    System.out.println("Input " + msg + ":");
    Scanner scan = new Scanner(System.in);
    int data = scan.nextInt();
    return data;
  }


  public static void main(String[] args) {

    int year = input("Year");
    String result = isLeap(year) ? year + " is leap year" : year + " is not leap year";
    System.out.print(result);
  }
}