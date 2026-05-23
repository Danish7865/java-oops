package Inheritance;
class Human
{
    private String name;
    int age;
    Human()
    {
        System.out.println("Human class Constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human
{
    void disp()
    {
        System.out.println("The age is : "+age);
       System.out.println("The name is :" + name); //Error show
    }        //private member not participate in inheritance or child class

}

public class Demo1
{
    public static void main(String[]args)
     {
        Student st=new Student();
        st.sleep();

     }
}
