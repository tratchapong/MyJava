// finding 2nd large in Array

import java.util.Arrays;

public class Second{
  
  public static void main(String[] args) {
    int[] num = {10,20,70,30,50,100,90};

    System.out.println(Arrays.toString(num));
    for(int i=0; i<num.length; i++) {
      int bigger = 0;
      for(int j=0; j<num.length; j++) {
        if(i==j) continue;
        
        if(num[i] > num[j]) {
        // System.out.println(num[i] + " vs " + num[j]);
          bigger++;
        }
        // if(bigger > 1)
        //   break;
      }  
      if(bigger == num.length-2)
         
        System.out.println(num[i] + " is 2nd big");      
    }
    
  }
}