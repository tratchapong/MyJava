public class Prime {
  public static void main(String[] args) {
    for( int i=1; i<100; i++) {
      boolean isPrime = true;
      for ( int d=2; d<=i/2; d++) {
        if (i%d==0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) 
        System.out.println(i);
    } 
  }
}
