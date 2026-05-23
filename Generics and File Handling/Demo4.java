//Comparable vs Comparator
import java.swing.event.SwingPropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student
{
    int marks;
    int age;
    String name;
    public Student(int marks,int age,String name)
    {
        this.marks=marks;
        this.age=age;
        this.name=name;
        
    }
    public int getMarks()
    {
        return marks;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String toString()// toString method se hamne ovveride kr rakha h isliye data show ho rha nhi to address show hota 
    {
        return marks+" - "+age+ " - "+name;
    }
}
//normally ham aaise sort karenge
class Alpha implements Comparator<Student> // comparator methot ko ham aaise implements krte h
{
    public int  compare(Student a, Student b)
    {
        if(a.age> b.age)// base on the age ho rha h agar ham chahe to marks base bhi kr skte h
        return 1;// return 1 ka matlab hota swap  karo
        else
        return -1;// return -1 ka matlab hota h swap na kro
    }
}

public class Demo4  
{
    public static void main(String[] args) 
    {
        Student st1=new Student(45, 18, "Danish");
        Student st2=new Student(50, 17, "Faiz");
        Student st3=new Student(60, 38, "Mahtab");

        ArrayList<Student> list=new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        System .out.println(list);
        //Agar ek abstact method hoga to ham lambda exprestion se solve karenge
        Comparator<Student> com=(Student a, Student b) ->
        {
        if(a.marks> b.marks)
        return 1;
        else
        return -1;
        };
        Collections.sort(list, com);
        System.out.println("**********************************");

       // Collection.sort(list); yaha pe compile time error aayage kyuki yaha multiple type ki data h student ke under
       //Comparable or Comparator ki help se ham data ko sort karenge
       Alpha a=new Alpha(); 
       Collections.sort(list, a);
       System.out.println(list);

    }
}
