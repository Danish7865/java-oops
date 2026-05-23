import java.io.*;





public class Demo12 
{
    public static void main(String[]args) throws Exception
    {
        File dir=new File("Faiz");
    File file=new File(dir,"pwl.txt");

    FileWriter fw=new FileWriter(file,true);//true is used for data not erase
    BufferedWriter bw=new BufferedWriter(fw);

    bw.write("java");
    bw.newLine();
    bw.write(65);
    bw.newLine();
    char ch[]={'p','w','j','a','v','a'};
    bw.write(ch);
    bw.close();


    }
    
}
