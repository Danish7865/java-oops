 package Interface;
interface A
{
    void show();
    //java 8 se pahle interface me define nhi hote the 
    //void config(); java 8 se phle ye feature available nhi tha default and static method
    default void config()
    {
       System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}
class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Demo4
{
    public static void main(String[] args) 
    {
     A.abc();
     A obj =new B();
     obj.show();
     obj.config();
    }
}