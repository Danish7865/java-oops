
public class Demo3 
{
    static int age;                   //1 
    static
    {  
        System.out.println("static block");  //2
       age=47;
    }
    static void disp()
    {
        System.out.println("Disp static method");//4  hamlog call krte h
        System.out.println(age);
    }

    public static void main (String[]args)
    {
        System.out.println("Main method");  //3 jvm call krta h main method ko
        disp();
    }
}
