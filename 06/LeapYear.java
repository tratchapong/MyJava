public class LeapYear {

  public static boolean isLeapYear(int year) {
      if( year%100 != 0 && year%4 == 0) {
        return true;
      }
      if( year%400 == 0) {
        return true;
      }
      return false;
  }

  public static boolean isLeap(int year) {
    return ( (year%100 !=0 && year%4 == 0) || year%400 == 0 ); 
  }

  public static void main(String[] args) {
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeap(1900));
    System.out.println(isLeap(2024));
  }
}