package Inheritance;
class Human
{
    private String name; //private veriable bhi inherit nhi hota h
    int age;
    Human()//constructor bhi inherit nhi hota 
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
    //public Student()
  //  {
        // super(); //behind the seen java compiler default constructor ko include kr leta hai
 //   }
    void disp()
    {
        System.out.println("The age is : "+age);
        //System.out.println("The name is :" + name); //Error show
    }        //private member not participate in inheritance or child class

}

public class Demo2
{
    public static void main(String[]args)
     {
        Student st=new Student();//yaha pe errorisliye nhi aa rha h kyuki supper method call ho rha 
       // st.sleep();              //constructor and private veriable not participate inheritance
        st.disp();
     }
}
