public class Demo1
{
    public static void main(String[] args) 
    {
        int num1=6;
        //int num2=0;//jaise hi ham yaha 0 kiya exception aaya lekin program ruka nhi aage run kr gya 
        int num2 = 0;
        int result=0;
        try //try block ki madad se ham exception handle krte h
        {
            result= num1/num2;
            System.out.println("in try block");// jaise hi error aaya vo sidha jump catch pr kar gya isliye hame normal chiz ko try ne nhi likhna chahiye
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong"+e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
