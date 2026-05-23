interface car //Lambda Expression 
{
    void drive(int avg,int ts);//functional interface kyuki yaha ek hi method h
    //agar ek se jada method honge to lambda Expression work nhi krega

}

public class Demo8
{
    public static void main(String[] args) 
    {
        car obj = (avg,ts)->
            {
                 System.out.println("Driving....Avg speed  "+avg+"  :top speed "+ts);//this is lambda expression
            };
        obj.drive(16,140);
    }
}
