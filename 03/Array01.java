
import java.util.Arrays;

public class Array01 {
  public static void main(String[] args) {
    
    int[] num = {10,20,30,40,50};
    for( int a : num) {
    	System.out.println(a);
    }
    
    for( int i=0; i<num.length; i++) {
    	if(num[i]>30) {
        	num[i] *= 2;
        }
    }
    System.out.println(Arrays.toString(num));
  }
}
