//Writing Data onto file using fileWriter
import java.io.*;
public class Demo9
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("faiz");

        File file=new File(dir,"pwl.txt");
        file.createNewFile();

       FileWriter fw=new FileWriter(file, true);
       fw.write("pw");
       fw.write("\n");
       fw.write(65);
        fw.write("\n");
       fw.write(97);
        fw.write("\n");
       char ch[]={'j', 'a', 'v', 'a'};
       fw.write(ch);
        fw.write("\n");

       fw.close();
       System.out.println("open pw.txt to see result");
    }
}