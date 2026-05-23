package Interface;

interface A // in java is not allow multiple inheritance
{
    void show();
    
}
interface X
{
    void abc();
}
class B implements A,X   //class hota h to extends aata h and jb interface hota h to implements
{
      public void show ()
      {
         System.out.println(" in show");
      }
      public void abc()// dono ka method define krna hota h hame
      {
        System.out.println("in abc");
      }
}
public class Demo1
{
    public static void main(String[]args)
    {
              B obj=new B();
              obj.show();
              obj.abc();

              A obj1=new B(); //child class ka reference parent class ka ho skta h
              obj1.show();
            //  obj1.abc(); error show  //not possible 
    }
}
