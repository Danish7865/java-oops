package Inheritance;
class Parent1 //extends object class 
{
    void disp()
    {
        System.out.println("Disp written in first class");
    }
}
class Parent2 //extends object class //jb ham extends nhi likhte hai tab by default extends object class
{
        //multipale inheritance class 
}
class child extends Parent1 , Parent2//ek child ke do parent nhi ho skte 
{

}
public class Demo5
{
    public static void main(String[] args) 
    {
        third d=new third();
        d.disp();
    }
    
}
