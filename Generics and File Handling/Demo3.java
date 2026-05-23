import java.util.*;

public class Demo3
{
    public static void main(String[] args) 
    {
        ArrayList al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(50);
        al.add(150);
        al.add(30);
        al.add(99);

        System.out.println(al);
        Collections.sort(al); // collection sort
        System.out.println(al);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Danish");
        al2.add("Faiz");
        al2.add("shahid");
        al2.add("zara");
        al2.add("Aajad");
        al2.add("Rinki");

        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);

        ArrayList al3=new ArrayList<>();
        al3.add(100);
        al3.add(200);
        al3.add(300);
        al3.add(400);
        al3.add(500);
        al3.add(600);

        System.out.println(al3);
       int index= Collections.binarySearch(al3, 500);
       //binarySearch ham tabhi apply kr skte h jb data sorting form me ho agar sorting form me nh ha to phle hame sort krna hoga 
       System.out.println("index is:"+index);

       Collections.rotate(al3, 3);
       System.out.println("rotate"+al3);

       Collections.shuffle(al3);
       System.out.println("Shuffle"+al3);

       System.out.println(Collections.frequency(al3, 200));
    }
}