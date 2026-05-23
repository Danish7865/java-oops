class Student
{
    private int age;
    private String name;

    public void setData()
    {
        age=18;
        name="Danish";
    }

     public void show()
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo1 
{
    public static void main(String[]args)
    {
        Student obj =new Student();
        obj.setData();               //private likhne ke bad data ko ham setData and show se call kar skte 
        obj.show();
    }
}