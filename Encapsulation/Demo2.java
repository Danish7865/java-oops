class Student
{
    private int age;
    private String name;

    public void setData1(int age)   //public ham isliye banaye hai taki ham ise kahi se bhi access kar le 
    {                       //private variable ko ham same class me hi access kar skte h
        age=age;             // agar hame use karna hai another class se to ham setData class bana kr use kr skte h
                           //mai chahta hu jab naya obj bnae to new valu assign ho na ki default valu 18 and Danish
                           // jab ham local variable ko instance variable me put krte h to output null aa jata h isko hi ham Shadowing proble bolte hai
    }                      // by default jo prefance milta h vo local variable ko milta h
    public void setData2()
    {
          name="Danish";
    }

     public void show()
     {
        System.out.println(name+" "+ age);
     }
}
public class Demo2 
{
    public static void main(String[]args)
    {
        Student obj =new Student();
        Student obj1 =new Student();
        obj.setData1(19);           
        obj1.setData1(20);    
        obj.show();
        obj1.show();
    }
}