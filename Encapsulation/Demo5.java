class Student
{
    private int age;
    private String name;
     public int getAge() { //right click and chosse option sourse action and click generate getters and setters
        return age;        //aaisa karne se hame type nhi krna prega auto generate ho jayega
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show()
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo5
{
    public static void main(String[]args)
    {
        Student obj =new Student();
        Student obj1 =new Student();
        obj.setAge(19);           
        obj1.setAge(20);    
        obj.setName("Danish");//
        obj1.setName("Rahul");
        int stud1Age=obj.getAge(); //ye inbuild method nhi ise ham banyege after set age ke bad
        System.out.println(stud1Age);
    }
}