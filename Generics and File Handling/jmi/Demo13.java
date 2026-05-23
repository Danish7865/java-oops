import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;

public class Demo13 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Faiz");
        File file=new File(dir,"pwl.txt");

        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);

        String line =br.readLine();

        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }

    }
}
