import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int s=((n*567/9+7492)*235)/47-498;
            int r=0;
            for(int j=1;j<=2;j++)
            {
                r=s%10;
                s/=10;
            }
            if(r<0)
            {
                r*=(-1);
            }
            System.out.println(r);
        }
    }
}
