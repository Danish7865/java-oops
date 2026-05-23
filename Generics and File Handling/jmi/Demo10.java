import java.io.*;

public class Demo10 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Faiz");
        File file=new File(dir,"pwl.txt");

        FileReader fd=new FileReader(file);
        int i=fd.read();
       // System.out.println((char)i);
        while (i!=-1) 
        {

            System.out.println(i+"------->");
            System.out.println((char)i);
            i=fd.read();// this is not good approch because if 100 latter then 100 times invoke
        }
    }
}
