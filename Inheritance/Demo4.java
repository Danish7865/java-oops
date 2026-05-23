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
        //Hierarchical inheritance class 
}
class third extends first
{

}
class fourt extends first
{

}
public class Demo4
{
    public static void main(String[] args) 
    {
        third d=new third();
        d.disp();
    }
    
}
