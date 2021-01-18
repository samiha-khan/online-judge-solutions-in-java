import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;  ;i++)
        {
            String name=sc.nextLine();
            if("Hajj".equals(name))
            { 
               System.out.println("Case "+i+": Hajj-e-Akbar");
            }
            else if("Umrah".equals(name))
            {
               System.out.println("Case "+i+": Hajj-e-Asghar");
            }
            else if("*".equals(name))
            {
               break;
            }
        }
     }
}          
