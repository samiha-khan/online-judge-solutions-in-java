import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            
            int [] a=new int [n];
            for(int j=0;j<n;j++){
                a[j]=sc.nextInt();
            }
            for(int j=0;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[j]+a[k]==m){
                        System.out.println((j+1)+" "+(k+1));
                        break;
                    }
                }
            }
        }
    }
}
