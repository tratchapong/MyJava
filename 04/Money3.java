public class Money3 {

  public static int[] calcBank(int money) {
    int[] bank = {1000, 500, 100, 50, 20, 10};
    int[] result = {0,0,0,0,0,0};
    System.out.println("Money = " + money);
    System.out.println("-----------------");
    for(int i=0; i<bank.length; i++){
        result[i] = money / bank[i];
        money = money % bank[i];
        System.out.println(bank[i] + " : "+ result[i]);
    }
    
    return result;
  }
  public static void main( String[] args) {
    int money1 = 4730;
    calcBank(money1);
    calcBank(9870);
  }
}

