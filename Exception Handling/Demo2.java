public class Demo2
{
    public static void main(String[] args) 
    {
        int num1=6;
        int num2 = 2;
        int result=0;
        int values[]={4,5,6,2};
        try//try ke under ham critical exception likhte h
        {
            result= num1/num2;
            System.out.println(values[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("stay in your limits");
        }
        catch(Exception e)//pura exception handle krne ke bad ye likhe isse sara exception handle ho jata h
        {
            System.out.println("Something went wrong.......");
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
