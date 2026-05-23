//final class Animal1//jaise hi ham final declear kiye hame error aa gya final class ko ham inherited nhi kr skte 
class Animal1
{
    final int age =19;
   final void sleep() //method me final likhne pe koi bhi error nhi aata h yani method inherited ho rha h
    {
       // age=20; variable ko ham final kr de to ham use change nhi kr skte h
       System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal1
{
//    void sleep()  //lekin ham chlid class me ise modify nhi kr skte yani ham sleep method ko override nhi kr skte 
//    {

//    }
}

public class finalkeyword 
{
    public static void main(String[] args) 
    {
        Tiger1 t=new Tiger1();
        t.sleep();
    }
}
