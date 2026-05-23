package Inheritance;

class AeroPlane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }
}
class CargoPlane extends AeroPlane //inherirtate method jab ham koi change na kare tab 
{                         //inherirtate method vo hote h jo parent class se child class me inherirtate hote h
                        // Or child class me koi modify na kiya gya ho
}
class passengerPlane extends AeroPlane
{

}

public class Demo6 
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        cp.takeoff();
        cp.fly();
        passengerPlane pp=new passengerPlane();
        pp.takeoff();
        pp.fly();
    }
}
