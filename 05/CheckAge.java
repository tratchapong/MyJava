// method example #2

public class CheckAge {

  public static boolean checkAge(int age) {
  	if(age < 18) {
    	return false;  // method will end by return
    } 
      return true;
    }

  // refactor above method (same results..)
    public static boolean checkAge2(int age) {
      return (age > 18);
    }

  public static void main(String[] args) {
    System.out.println(checkAge(17));
    System.out.println(checkAge2(17));
    System.out.println(checkAge(23));
    System.out.println(checkAge2(23));
  }
}
