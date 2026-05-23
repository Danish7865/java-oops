interface car 
{
    void drive();
}
// class Wagnor implements car
// {
//     public void drive()
//     {
//         System.out.println("Driving....");
//     }
// }


public class Demo7 
{
    public static void main(String[] args) 
    {
        car obj = new car() {//Anonymous inner class
            public void drive()
            {
                 System.out.println("Driving");
            }
        };
        obj.drive();
    }
}
