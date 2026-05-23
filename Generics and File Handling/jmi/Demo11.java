import java.io.*;

public class Demo11
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Faiz");
        File file=new File(dir,"pwl.txt");

        FileReader fd=new FileReader(file);
        char ch[]=new char[(int)file.length()];

        fd.read(ch);

        for (char data:ch)//this is good approch for performance
        {
            System.out.print(data);
        }

    }
}
