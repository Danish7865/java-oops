//Fundamentals before IO operation
class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String toString()
    {
      return "Name :" + name + "   Age :" + age + "   City :"+ city;
    }
}
public class Demo6 
{
   public static void main(String[] args) 
   {
     Student st1=new Student("Danish", 18, "Chapra");
     System.out.println(st1);

    Student st2=new Student("Faiz", 19, "Delhi");
    System.out.println(st2);

    Student st3=new Student("Mahtab", 20, "Patna");
    System.out.println(st3);


   }
}
   
