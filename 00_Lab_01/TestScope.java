
public class TestScope
{
    static int x = 11;
    private int y = 33;
    public void method1(int xx)
    {
        TestScope t = new TestScope();
        this.x = 22;
        int y = 44;
 
        System.out.println("TestScope.x: " + TestScope.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("this.y: " + this.y);
        System.out.println("y: " + y);
    }
 
    public static void main(String args[])
    {
        // TestScope.x = 99;
        TestScope tt = new TestScope();
        tt.y = 55;
        tt.method1(5);
    }
}
