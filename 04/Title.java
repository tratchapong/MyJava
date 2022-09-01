public class Title {
  public static void showTitle(String str) {
    for(int i=0; i<str.length()+; i++) {
      System.out.print('*');
    }
    System.out.println();
    System.out.println(str);
    for(int i=0; i<str.length(); i++) {
      System.out.print('*');
    }
    System.out.println();

  }
  
  public static void main(String[] args) {
    showTitle("Java AP Program");
    showTitle("is the best one.");
  }
}