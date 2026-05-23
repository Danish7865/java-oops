import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name,int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;
    }
}

public class Demo15 
{
    public static void main(String[] args) throws Exception
    {
         Cricketer c=new Cricketer("Sachin", 20, 100000);

         FileOutputStream fos=new FileOutputStream("pwl.txt.");//serialization method
         ObjectOutputStream oos=new ObjectOutputStream(fos);//data ko crush krke byte code me transfer

         oos.writeObject(c);
         oos.flush();
         oos.close();

    }
}
