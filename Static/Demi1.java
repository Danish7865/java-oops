class Demo
{
    static int a; //static variable
    static int b;

    int m;        //non static variable yani instance variable
    int n;
    
    static    // static block
    {
        System.out.println("control in static block");
        a=10;
        b=20;
    }

    {
        System.out.println("control in non static block");
        m=30;
        n=40;
    }

    static void disp()
    {                                                   //static block me ham non static varible nhi use kar skte h
        System .out.println("value of static var a:"+a);//jo static hote h unhe object banane ya na bnane se koi fark nhi prta h
        System .out.println("value of static var b:"+b);
    }

    void disp2()  //non static me object build kana compalsory hai
    {
        System .out.println("value of non static var m:"+m);
        System .out.println("value of non static var n:"+n);
    }
}

public class Demi1
{
    public static void main(String[]args)
    {
       Demo d=new Demo();
       d.disp2();
       //Demo.disp();

    }
}
