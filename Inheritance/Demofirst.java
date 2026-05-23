package Inheritance;
class Human //Super class //Base class // Parent class
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human //Child class //sub class //derived class extends keyword ke through ham do class ko merge krte h
{

}

public class Demofirst 
{
    public static void main(String[]args)
     {
        Student st=new Student(); //student class ko ham obj bna kr ham human class se data fetch kr skte h
        st.sleep();

     }
}
