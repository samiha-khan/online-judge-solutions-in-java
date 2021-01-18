import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int account=0;
        for(int i=1;i<=t+1;i++)
        {
            String operation=sc.nextLine();
            String []b=operation.split(" ");
            if("donate".equals(b[0]))
            { 
               int tk=Integer.parseInt(b[1]);
               account+=tk;
            }
            else if("report".equals(b[0]))
            {
               System.out.println(account);
            }
        }
     }
}          
