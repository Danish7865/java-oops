package Inheritance;

public class Vehicle {
    String brand;
    int speed;

    void start(){
        System.out.println("Vehicle is starting....");
    }

    void stop(){
        System.out.println("Vehicle has stopped.....");
    }

    void setDetails(String b, int s) {
        brand =b;
        speed =s;
    }

    void showDetails(){
        System.out.println("Brand:  " + brand);
        System.out.println("Speed: " + speed +"km/h");
    }

    class Bike extends Vehicle {
        void kickStsrt(){
            System.out.println("Bike is kick - strted");
        }
    }

    
}
