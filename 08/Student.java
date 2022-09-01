class Student {
    String firstname;
    int age;
    protected String level;
    private boolean enroll;

    public void enroll() {
        enroll = true;
        System.out.println("enroll=" + enroll);
        System.out.println(firstname + " is Enroll");
    } 
    public void un_enroll() {
        enroll = false;
        System.out.println("enroll=" + enroll);
        System.out.println(firstname + " is not Enroll");
    } 
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstname = "Andy";
        System.out.println(s1.firstname);
        s1.level = "4";
        System.out.println(s1.level);
        s1.enroll();
        s1.un_enroll();
        // s1.enroll = true;
        // System.out.println(s1.enroll);        
    }
}