public class Demo
{
  
    public static void main (String[] args)
    {
       int num[][]=new int[2][3];
       num[0][0]=5;
       num[0][1]=6;
       num[0][2]=7;
       num[1][0]=1;
       num[1][1]=2;
       num[1][2]=3;
       for(int i=0;i<2;i++)
       {
        for(int j=0;j<3;j++)
        {
            System.out.print(num[i][j]+ " ");
        }
           System.out.println();
       }
       
    }
}