  import java.util.*;
  public class Leapyear {

    public static void main(String [] args) {
      int year = 2300;
      String yearInput;
      String result = "not a Leap Year";
      Scanner scan = new Scanner(System.in);

      System.out.println("Input Year : ");
      // yearInput = inp.nextLine();
      // year = Integer.parseInt(yearInput);

      year = scan.nextInt();
      // scan.close();
      if( year%100 != 0 && year%4 == 0) {
        result = "Leap Year";
      }
      if( year%400 == 0) {
        result = "Leap Year";
      }
      System.out.println(year + " is " + result);
    }
  }
