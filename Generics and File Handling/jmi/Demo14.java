import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Demo14 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("Faiz");
        File file=new File(dir,"pwl.txt");

        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);//best apporoch for printing

        pw.write(97);//not print 97 crosponding value is print
        pw.write("\n");

        pw.println("java");
        pw.println(100);
        pw.println('a');
        pw.println(5.5);
        pw.println(true);

        pw.close();
    }
}
