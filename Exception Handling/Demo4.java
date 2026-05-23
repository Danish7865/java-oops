class Demo
{
 public void a() throws Exception
 {
      b();
 }
 public void b() throws Exception //throw exception mean mai error handle nhi karunga and age forward
 {
    int num1=8;
    int num2=0;
    int result=num1/num2;
    System.out.println(result);
 }
}

public class Demo4 
{
    public static void main(String[] args) 
    {
       Demo obj=new Demo();
       try
       {
            obj.a();
       }
       catch(Exception e)
       {
        System.out.println("Error in b method not dividen in 0");
       }
       
    }
}
