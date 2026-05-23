class AeroPlane2
{
    public void takeoff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("CargoPlane reqires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}
class PassengerPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("PassengerPlane reqires medium size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane2 extends AeroPlane2
{
    public void takeoff()
    {
        System.out.println("PassengerPlane reqires small size runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at high height");
    }
}
class Airport
{                                  //ye h hamara run time polymorphism
    public void poly(AeroPlane2 ref)//polymorphism one into many
    {
          ref.takeoff();
          ref.fly();
          System.out.println("------------------------------------------");
    }
}
public class Demo1 
{
    public static void main(String[] args) 
    {
        CargoPlane2 cp=new CargoPlane2();
        PassengerPlane2 pp=new PassengerPlane2();
        FighterPlane2 fp=new FighterPlane2();

        cp.takeoff();
        cp.fly();

        pp.takeoff();
        pp.fly();

        fp.takeoff();
        fp.fly();
        
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");

        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
