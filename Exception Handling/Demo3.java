import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3
{
    public static void main(String[] args) 
    {
       int num=0;
      // Scanner sc =new Scanner(System.in);
       try( Scanner sc =new Scanner(System.in);)//new version
       {
            num=sc.nextInt();
       }
    //    finally  //old version me aaisa tha 
    //    {
    //     sc.close();
    //     System.out.println("Resourse closed");
    //    }
       System.out.println(num);
    }
}
