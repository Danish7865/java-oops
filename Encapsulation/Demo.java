class Student
{
    int age;
    String name;

     public void show()
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo 
{
    public static void main(String[]args)
    {
        Student obj =new Student();//bahar ki duniya se yah access na ho isliye encapsulation ka use krte hai 
        obj.age =18;               //agar ham variable ko private kar denge to bahar ki duniya se access nhi hoga.
        obj.name ="danish";
        obj.show();
    }
}
