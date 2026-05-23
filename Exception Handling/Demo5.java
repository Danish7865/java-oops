// custom exception and throw keyword

//  class MyException extends Exception
//  {
       // public MyException(){}
       //public MyException(String msg)
      //  {
      //    super(msg)
      //  }
       //ye khud ka bnaya hua exception h
//  }
public class Demo5
{
    public static void main(String[] args) 
    {
      int num1=6;
      int num2=-2;
      try
      {
         if (num2<0)
         {
           // Exception e=new MyException("negative number");
            Exception e=new ArithmeticException("negative number");
            throw e; //throw keyword se obj throw kr skte h
         }
         else
         {
            int result=num1/num2;
            System.out.println(result);
         }
      }
         catch(Exception e)
         {
            System.out.println("Enter a valid number"+e);
         }
      }
}
