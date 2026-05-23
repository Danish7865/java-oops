class Animal
{
    public void eat()
    {
        System.out.println("Animal eats everyday");
    }
     public void age(int x)
    {
        System.out.println("Animal age is");
    }
}

class Tiger extends Animal
{
    public void eat()//yaha pe ham public ko hata nhi skte h kyuki parents class me public h visibility ko ham increase nhi kr skte 
                     // visibility ko ham decrease kr skte h overridding ke samay
    {
        System.out.println("Tiger hunts and eat");
    }
    // public int age() //agar parents class me void h to child class me bhi void hi hoga
    // {
    //     return 10;
    // }
     public void age()//yaha pe parameter same nhi h isliye override nhi hoga
    {
        System.out.println("Animal age is");
    }
}

public class Demo8 
{
    public static void main(String[] args) 
    {
        Tiger t=new Tiger();
        t.eat();
    }
}
