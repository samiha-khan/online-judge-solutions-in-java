import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int sum=0;
            int first=sc.nextInt();
            int last=sc.nextInt();
            for(int j=first;j<=last;j++)
            {
                if(j%2==1)
                {
                    sum+=j;
                }
            }
            System.out.println("Case "+i+": "+sum);
        }
    }
}
