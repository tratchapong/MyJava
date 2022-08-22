// Prime number 1-100 ?

public class Prime {

  public static void main(String[] args) {
    for(int i=1; i<=100; i++) {
      boolean isPrime = true;
      for(int a=2; a<i; a++) {
        if(i%a==0) {
          isPrime = false;
          break;
        }
      }
     if(isPrime == true) {
        System.out.println(i);
     }
    }
  }
}