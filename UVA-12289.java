import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
            String n=sc.nextLine();
            int l=n.length();
            int c=0;
            if(l==3)
            {
               if(n.charAt(0)=='o')
               {
                  c++;
               }
               if(n.charAt(1)=='n')
               {
                  c++;
               }
               if(n.charAt(2)=='e')
               {
                  c++;
               }
               if (c==2||c==3)
               {
                  System.out.println("1");
               }
               }
               if(l==3&&c!=2&&c!=3)
               {
                    c=0;
                    if(n.charAt(0)=='t')
                    {
                        c++;
                    }
                    if(n.charAt(1)=='w')
                    {
                        c++;
                    }
                    if(n.charAt(2)=='o')
                    {
                        c++;
                    }
                    if (c==2||c==3)
                    {
                        System.out.println("2");
                    }
                }
            
            if(l==5)
            {
                if(n.charAt(0)=='t')
                {
                    c++;
                }
                if(n.charAt(1)=='h')
                {
                    c++;
                }
                if(n.charAt(2)=='r')
                {
                    c++;
                }
                if(n.charAt(3)=='e')
                {
                    c++;
                }
                if(n.charAt(4)=='e')
                {
                    c++;
                }
                if (c==4||c==5)
                {
                    System.out.println("3");
                }
            }
        }
    }
}
