class Demo
{
   static void disp1()
   {
      System.out.println("static method disp1");
   }

   void disp2()
   {
      System.out.println("non static disp2");
   }
}


public class Demo2 
{
    public static void main(String[]args)
    {
          Demo.disp1();  //static method call direct and invoke. obj creat krne ki koi jarurat nhi 
          //Demo.disp2();  obj dependent hote h obj banana compulsary h
          Demo d=new Demo();
          d.disp2();
          //d.disp1(); //static method invoke with obj and without obj

          //Arrays.sort(args); ye java team ke dawara bnaya gya code ye ek static method h
    }
}
