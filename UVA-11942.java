import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Lumberjacks:");
        for(int i=1;i<=n;i++)
        {
            int []a=new int[10];
            for(int j=0;j<a.length;j++)
            {
                a[j]=sc.nextInt();
            }
            if(a[0]>a[1])
            {
                int c=0;
                for(int j=1;j<a.length-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        c++;
                    }
                }
                if(c==8)
                {
                    System.out.println("Ordered");
                }
                else
                {
                    System.out.println("Unordered");
                }
            }
            if(a[0]<a[1])
            {
                int c=0;
                for(int j=1;j<a.length-1;j++)
                {
                    if(a[j]<a[j+1])
                    {
                        c++;
                    }
                }
                if(c==8)
                {
                    System.out.println("Ordered");
                }
                else
                {
                    System.out.println("Unordered");
                }
            }
        }
    }
}
