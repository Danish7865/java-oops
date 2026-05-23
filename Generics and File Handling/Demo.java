//Generics java 5 me include hua h use phle ye concept nhi tha

import java.util.*;

public class Demo 
{

    public static void main(String[] args) 
    {
        //Array typesafety ko promot krta h
        String ar[]=new String[10];
        ar[0]="Danish";
        ar[1]="pw";
        //ar[2]=10;  compile time error kyuki string type data me ham intiger type nhi de skte
        String name1=ar[0];
        String name2=ar[1];
        
        //no typesafety  yaha pe kisi bhi type ka data ho skta h example int,string,boolean,etc
        ArrayList al=new ArrayList();
        al.add("Shahid");
        al.add("Danish");
        al.add(10);

        String n1=(String)al.get(0);// typecasting
        String n2=(String)al.get(1);
        //String n3=(String)al.get(2); runtime error ises se bachne ke liye ham generics ka use krte h

        ArrayList<String>al1=new ArrayList<String>();//typesafety achived using generics
        al1.add("Danish");
        al1.add("Shahid");
       // al1.add(10); compile time error kyuki string type data me ham intiger type nhi de skte
       //ye grnerics ka fyada h hme compile ke time hi bata deta h error

        String n4=al1.get(0);// yaha hme type casting ki bhi need nhi h
        String n5=al1.get(1);
        //String n6=al.get(2);
    }
}
