package Interface;

interface Computer
// interface me ham design creat krte h aur class se use implement krte h
{
    void compileCode();
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 error");
    } 
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("you got 5 error.....faster");
    } 
}

class Developer
{
   public void buildApp(Computer obj)
   {
    System.out.println("Building App");
    obj.compileCode();
   }
}


public class Demo2
{
    public static void main(String[] args) 
    {
        Computer obj=new Laptop();
        Developer dev = new Developer();
        dev.buildApp(obj);  
    }
}