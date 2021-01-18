import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            long n=sc.nextInt();
            long m=sc.nextInt();
            long sum=m*n/2;
            System.out.println("Case "+i+": "+sum);
        }
    }
}
