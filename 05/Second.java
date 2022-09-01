// finding 2nd large in Array

import java.util.Arrays;

public class Second{
  
  public static void main(String[] args) {
    int[] num = {10,20,70,30,150,100,90};

    System.out.println(Arrays.toString(num));
    
    for(int i=0; i<num.length; i++) {
      int bigger = 0;
      for(int j=0; j<num.length; j++) {
        if(i==j) continue;       
        if(num[i] > num[j]) {
        // System.out.println(num[i] + " vs " + num[j]);
          bigger++;  
        }
      }  
      if(bigger == num.length-3) { // 7-2= 5        
        System.out.println(num[i] + " is 3rd big");
      }    
    }
    
  }
}