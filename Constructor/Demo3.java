class Student1
{
    private String name;  //this method call vs super method call
    private int age;      //simply ek constructor ko dusre constructor ko kaise call karte h
    public Student1()
    {
        //super(); //behind the seen jab program excute hoga tb super method work karta h chahe aap likho ya na likho
        this("Rohit",24);
        System.out.println("Default Constructor is called");  //super class ka ek hi kam hota h parents class ko call karna 
        name="Faiz";
        age=45;           
    }                      
    Student1(String name)
    {
              this(); //jab this method hoga tab super method nhi hoga agar ham kuch nhi likhe to by default super method ko call krega
              this.name=name;
              age=19;
    }
    Student1(String name,int age)
    {
              this.name=name;
              this.age=age;
    }

    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Demo3
{
    public static void main(String[]args)
    {
        Student1 st1=new Student1();
        st1.disp();
        System.out.println("****************************");

        Student1 st2=new Student1("kiran");
        st2.disp();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Student1 st3=new Student1("Sima",20);
        st3.disp();
      

    }
}