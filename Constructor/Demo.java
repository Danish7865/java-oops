class Student
{
    private String name;
    private int age;
    Student(String name,int age) //same name hona chahiye class and constructor ka 
    {                            // ye constructor ka syntax hai
        this.name=name;
        this.age=age;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public int getAge() {
    //     return age;
    // }
    // public void setAge(int age) {
    //     this.age = age;
    // }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    } 

}
public class Demo
{
     public static void main (String[] args)
     {
        Student st =new Student("Danish",10); //constuctor call tab hota h jab ham obj creat karte hai
        // st.setName("Danish");
        // st.setAge(19);

        String name=st.getName();
        System.out.println(name);
        int age=st.getAge();
        System.out.println(age);
     }
}