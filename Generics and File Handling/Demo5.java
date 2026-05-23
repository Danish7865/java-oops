//Comparable vs Comparator
import java.util.*;
import javax.swing.event.SwingPropertyChangeSupport;
class Student implements Comparable<Student>//Comparable  interface ka use kre ke ise handle kiya ja raha h
// comparable interface ka use tarket class me hi kiya jata h
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
    public int compareTo(Student a)
    {
        if(this.age> a.age)
        return 1;
        else
        return -1;

    }
}


public class Demo5
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

        Collections.sort(list);// behind the seen code kiya hua h isliye hame call krne ki koi jarurat nhi h
        System.out.println(list);
    // jab bhi aap aaise obj ki sorting kr rhe ho collection.sort use krke agar vo class apke pass accessable h aur 
    // aapke pass right bhi h aap usme modify kr skte h tb aap comparable interface ka use kre
    //agar accessable aur modify ki right na ho tb comparator ka use karenge
        
        

    }
}
