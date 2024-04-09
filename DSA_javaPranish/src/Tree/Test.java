package Tree;

public class Test {
     int num = 0;
    Test a, b;
    Test() // Non-Parameterize constructor
    {

    }

    Test(int b) //parameterized Constructor
    {
        num = b;
        System.out.println(num);
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(5);
    }
}
