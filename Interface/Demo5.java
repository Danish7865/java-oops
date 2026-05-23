//three type of inner class 
//member , static and Anonymous
class A //outer class and normal class ko ham static nhi bna skte h
{
    public void show()
    {
        System.out.println("in show");
    }
   // static class B  //only ham inner class ko hi static bna skte h
   class B
    {
       public void Display()
       {
        System.out.println("in Display");
       }
    }

}




public class Demo5 
{
    public static void main(String[] args) 
    {
        A obj=new A();
        A.B obj1=obj.new B(); //inner class ka obj aaise create hota h
        obj.show();
        obj1.Display();
    }
}
