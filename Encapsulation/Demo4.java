class Student
{
    private int age;
    private String name;

    public void setAge(int age)   //setAge likhne se ye pata chalta hai ki ham kya kar rhe h
    {                       
       this.age=age;  
    }                      
   public int getAge()  //yaha ham void nhi likh skte kyu ham valu de rhe h
    {
       return age;
   }
    public void setName(String name) //setData ke jagah ham setName likhte taki dekhne vale ko confusion na ho
    {
          this.name=name;
    }
    public String getName()
    {
        return name;
    }

     public void show() // show ka ham print karane ke liye use krte h 
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo4 
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
        String stud1name=obj.getName();
        System.out.println(stud1Age);
        System.out.println(stud1name);
        //obj.show();
       // obj1.show();
    }
}