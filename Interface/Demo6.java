//three type of inner class 
//member , static and Anonymous

class A //outer class and normal class ko ham static nhi bna skte h
{
    public void show()
    {
        System.out.println("in show");
    }
   static class B  //only ham inner class ho hi static bna skte h
    {
       public void Display()
       {
        System.out.println("in Display");
       }
    }

}

public class Demo6
{
    public static void main(String[] args) 
    {
        A obj=new A();
        //A.B obj1=obj.new B(); //member inner class ka obj aaise create hota h
        A.B obj1=new A.B();// static inner class ka obj aaise crete hota h vaise ham project me ise use nhi karenge only knowledge purpose
        obj.show();
        obj1.Display();
    }
}
