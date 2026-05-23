//creat file and Directory using file //class

import java.io.*;

public class Demo7 
{
    public static void main(String[] args) throws IOException
    {
        File file1=new File("sano.txt");
        System.out.println(file1.exists());

        file1.createNewFile();
        System.out.println(file1.exists());

        File dir=new File("Faiz");
        System.out.println(dir.exists());

        dir.mkdir();
        System.out.println(dir.exists());

    }
   
}
