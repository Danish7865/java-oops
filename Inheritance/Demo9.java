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
    { //super() likhe ya na likhe ye automatic call ho jata h super method dusre constructor ko call krta h yani parent class cocstructor ko call krta h
        super(10,20);
        System.out.println("Child class constructor");
    }
    public Demo2(int x,int y)
    {
        System.out.println("parameterized child class Constructor");
        m=x;
        n=y;
    }
}

public class Demo9 
{
    public static void main(String[] args) 
    {
        Demo2 d=new Demo2();
        Demo2 d2=new Demo2(10,20);
    }
}
