public class Money2 {
  public static void main( String[] args) {
    int money = 4730;

    int b1000, b500, b100, b50, b20, b10;

    System.out.println("Money : " + money);
    b1000 = money / 1000;
    System.out.println("B1000 = "+ b1000);
    money = money % 1000;
    System.out.println(money);
    b500 = money / 500;
    System.out.println("B500 = "+ b500);
    money = money % 500;
    System.out.println(money);
    b100 = money / 100;
    System.out.println("B100 = "+ b100);
    money = money % 100;
    System.out.println(money);
    b50 = money / 50;
    System.out.println("B50 = "+ b50);
    money = money % 50;
    System.out.println(money);
    b20 = money / 20;
    System.out.println("B20 = "+ b20);
    money = money % 20;
    System.out.println(money);
    b10 = money / 10;
    System.out.println("B10 = "+ b10);
    money = money % 10;
    System.out.println(money);

  }
}