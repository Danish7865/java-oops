package Interface; 

interface A 
{
    int num=6; // jo bhi variable interface ke under hote h vo by default public static and final hote h
    void show();
    
}
public class Demo 
{
    public static void main(String[]args)
    {
               //System.out.println(num);  this is not work becouse num variable A me bna h isliye demo me use nhi kr skte h
               System.out.println(A.num); //static h isliye ham use kr skte h
              // A.num=9; basecally A final variable h isliye hm ise change nhi kr skte h
              //A obj=new A();  not creat an object. 
    }
}
