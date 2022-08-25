public class Max {

  public static void main(String[] args) {
    int[] num = {10,100,20,130,150,120,70};

      int max = num[0];
      for(int i=0; i<num.length; i++) {
        if(max < num[i]) {
          max = num[i];
        }
      }
      System.out.println("1st = " + max);
      int nextmax = num[0];
      for(int i=0; i<num.length; i++) {
        if(nextmax < num[i] && num[i] != max) {
          nextmax = num[i];
        }
      }
      System.out.println("2nd = " + nextmax);
  }
}