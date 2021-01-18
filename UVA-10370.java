import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        for(int i=1;i<=c;i++)
        {
            int n=sc.nextInt();
            int []a=new int[n];
            int sum=0;
            for(int j=0;j<a.length;j++)
            {
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            int average=sum/n;
            int sNo=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]>average)
                {
                    sNo++;
                }
            }
            double percentage=sNo*100.0/n;
            System.out.printf("%.3f",percentage);
            System.out.print("%");
            System.out.println();
        }
    }
}
