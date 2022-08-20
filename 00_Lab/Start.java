public class Start {

  public static void main(String args[]) {
    System.out.println("-----------------");
    User u1 = new User("Andy");
    User u2 = new User("Bobby");
    System.out.println("Sawasdee, Java \n");
    System.out.println(u1.showInfo());
    u1.login();
    System.out.println(u1.showInfo());
    System.out.println(u2.showInfo());
    u2.login();
    System.out.println(u2.showInfo());
  }
}