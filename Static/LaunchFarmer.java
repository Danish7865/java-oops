import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
    //float ri;//rate of intrest sabhi farmer ke liye same isliye hame ise static banana prega
             //agar nhi banayege to har jaga space lega and memory full krega 
    static float ri;
    float si;
    static
    {
       ri=4.5f; //yaha ek bar hi heap area me copy bnaegi loading time  agar 100 obj h tab bhi ek bar bnegi
    }   // jab har obj ke liye data alag alag ho tb ham use instance variable hi rakhte h

    void input()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the amount required");
        pa=scan.nextInt();
        System.out.println("please enter the time duraation");
        td=scan.nextFloat();
        ri=4.5f;

    }
    void compute()
    {
        si=(pa*td*ri)/100f;
    }
    void disp()
    {
        System.out.println("SI is :"+si);
    }
}

public class LaunchFarmer
{
    public static void main(String[]args)
    {
            Farmer f1=new Farmer();
            Farmer f2=new Farmer();

            f1.input();
            f1.compute();
            f1.disp();

            f2.input();
            f2.compute();
            f2.disp();

    } 
}