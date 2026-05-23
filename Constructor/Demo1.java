class Demo
{
    private int a;
    private int b;

    // public Demo()
    // {
    //     default generated constructor and paramete not allow in creat time obj
    // }
    Demo()
    {
        System.out.println("Zero parametrized constructor by programmer");
    }
    Demo(int a,int b)
    {
              this.a=a;
              this.b=b;
    }

    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class Demo1
{
    public static void main(String[]args)
    {
       // Demo d=new Demo(); default constructor tabhi include hota h jab pahle se koi bhi constructor class me na ho
       Demo d=new Demo();
       d.disp();
       Demo d2=new Demo(10,20);
       d2.disp();

    }
}