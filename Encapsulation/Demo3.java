class Student
{
    private int age;
    private String name;

    public void setData1(int age)   
    {                       
       this.age=age;//when ham this. ka use krte h to to vo current object ko preffer karta h aur hamara problem solve ho jata h
    }                      
    public void setData2(String name)
    {
          this.name=name;
    }

     public void show()
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo3 
{
    public static void main(String[]args)
    {
        Student obj =new Student();
        Student obj1 =new Student();
        obj.setData1(19);           
        obj1.setData1(20);    
        obj.setData2("Danish");//
        obj1.setData2("Rahul");
        obj.show();
        obj1.show();
    }
}