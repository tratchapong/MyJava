public class User {
  String username, password;
  Boolean isLogin = false;

  User(String name) {
    username = name;
  }

  void login() {
    if(isLogin) 
      System.out.println("Already Login..");
    else {
      isLogin = true;
      System.out.println("Welcome, "+username);
    }
  }
  String showInfo() {
    return ("Username : " + username + "\n Login Status : " + isLogin);
  }

  void logout() {
    isLogin = false;
    System.out.println("Goodbye !!!");
  }
}
