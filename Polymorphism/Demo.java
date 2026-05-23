class AeroPlane
{
    public void takeoff()//inherited method
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is Flying");
    }
}
class CargoPlane extends AeroPlane 
{                         
    public void fly()//overriding method
    {
        System.out.println("CargoPlane flies at lower height");
    } 
    public void carryGoods()//specialized method
    {
        System.out.println("CargoPlane carries goods");
    }
}
class passengerPlane extends AeroPlane
{
       public void fly() //overriding method
    {
        System.out.println("passengerPlane flies at medium height");
    }
    public void carryPassenger() //specialized method
    {
        System.out.println("passengerPlane carries Passenger");
    }
}

public class Demo
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        cp.takeoff();
        cp.fly();
        passengerPlane pp=new passengerPlane();
        pp.takeoff();
        pp.fly();
        System.out.println("----------------------------------------");
        
        AeroPlane ref;

        ref=cp;
        ref.takeoff();
        ref.fly();
        System.out.println("--------------------------------------------");

        ref=pp;
        ref.takeoff();
        ref.fly();
    }
}
