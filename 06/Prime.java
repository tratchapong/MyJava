public class Prime {

  public static boolean isPrime(int n) {
    for(int i=2; i<=n/2; i++){
      if( n%i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    for (int n=1; n<100; n++)
      System.out.print( isPrime(n) ? n + "\n" : "" );
  }
}