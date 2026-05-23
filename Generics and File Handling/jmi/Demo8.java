//More in File class

import java.io.*;

public class Demo8 
{
    public static void main(String[] args) throws IOException
    {
        File dir=new File("Sanojava22");
        System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refering to directory Sanojava22:  "+dir.isDirectory());
        
        File file=new File(dir,"Sanoskill.text");
        file.createNewFile();
        System.out.println("file is refering to Sanoskill.text:  "+file.isFile());

        int count=0;
        File f=new File("Sanojava22");
        String str[]=f.list();
        for(String name: str)
        {
            count++;
            System.out.println(name);
        }
        System.out.println("No of files are  "+ count);
    }
}
