import java.io.*;

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
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
}

public class Demo16
{
    public static void main(String[] args) throws Exception
    {
        //  Cricketer c=new Cricketer("Sachin", 20, 100000);
        //  c.disp();

        //  FileOutputStream fos=new FileOutputStream("pwl.txt.");//serialization method
        //  BufferedOutputStream bos=new BufferedOutputStream(fos);
        //  ObjectOutputStream oos=new ObjectOutputStream(bos);

        //  oos.writeObject(c);
        //  oos.flush();
        //  oos.close();

        FileInputStream fis=new FileInputStream("pwl.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Cricketer cr=(Cricketer)ois.readObject();
        cr.disp();

        ois.close();
    }
}
