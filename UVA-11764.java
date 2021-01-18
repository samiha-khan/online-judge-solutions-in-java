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
            int h=0,l=0;
            int []a=new int[n];
            for(int k=0;k<a.length;k++)
            {
                a[k]=sc.nextInt();
            }
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    h++;
                }
                else if(a[j]>a[j+1])
                {
                    l++;
                }
            }
            System.out.println("Case "+i+": "+h+" "+l);
        }
    }
}
