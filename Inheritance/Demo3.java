package Inheritance;
class first
{
    void disp()
    {
        System.out.println("Disp written in first class");
    }
}
class second extends first
{
        //multi-level inheritance class 
}
class third extends second
{

}
class fourt extends third
{

}
public class Demo3 
{
    public static void main(String[] args) 
    {
        third d=new third();
        d.disp();
    }
    
}
