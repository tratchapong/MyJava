public class Max {

  public static void main(String[] args){
    int[] num = {10,100,20,130,50,120,70};
    int max = num[0];

    for(int i=1; i<num.length; i++){
      if(num[i] > max){
        max = num[i];
      }
    }
    System.out.println("1st = " + max);
  }
}