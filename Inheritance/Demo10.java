class Demo1
{
    int a,b;
    public Demo1()
    {
        System.out.println("Parent class constructor");
    }
    public Demo1(int x,int y)
    {
        System.out.println("parameterized Parent class Constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1
{
    int m,n;
    public Demo2()
    { 
        this(10,20);// this method ki duty h ki vo same class ke constructor ko call kre 
        System.out.println("Child class constructor");
    }
    public Demo2(int x,int y)
    {
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}

public class Demo10
{
    public static void main(String[] args) 
    {
        Demo2 d=new Demo2();
       // d.Demo2;
       // Demo2 d2=new Demo2(10,20);
    }
}
