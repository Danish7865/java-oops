abstract class AeroPlane2 //agar java me koi bhi ek bhi abstract method h to hame class ko abstract bannana parega 
{
   //abstract int age;//abstract variable ko ham use nhi kr skte ye kyuki ye unlogical h
   // abstract constructor ko bhi ham use nhi kr skte h
   abstract public void takeoff();//abstract method ek aaisa method hota h jiski koi body nhi hotih silf implimation hoti h
    //  yaha ham 100% abstraction ko achive kiya h
   abstract public void fly();
  public void landing()//ab ham 100% abstraction ko achive nhi kr rhe h
  {
    System.out.println("AeroPlane is landing");
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
    public void alert()
    {
        System.out.println("Alert...");
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
public class Demo
{
    public static void main(String[] args) 
    {
        AeroPlane2 ref=new CargoPlane2();
        ref.takeoff();
        ref.fly();
        ref.landing();
      //ref.alert();//parent class ka reference use krke child class ke inherited and overridden method ko call kr skte ho leki specialized method ko nhi  
        ((CargoPlane2) ref).alert();//Down casting ka use krke ham specialized method ko call kr skte h
        AeroPlane2 ref2=new PassengerPlane2();
        ref2.takeoff();
        ref2.takeoff();
        ref2.landing();

        AeroPlane2 ref3=new FighterPlane2();
        ref3.takeoff();
        ref.fly();
        ref.landing();

       // AeroPlane2 ref4=new AeroPlane2(); //AeroPlane class ek abstarct class jb koi class abstract hoti h to uska obj create nhi kr skte h
       //kyuki abstract class ki koi body nhi hoti h

        
    }
}
