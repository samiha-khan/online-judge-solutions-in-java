    import java.util.Scanner;
    public class Main
             {
             	public static void main(String []args)
            	{
            	Scanner sc=new Scanner(System.in);
            	int n=sc.nextInt();
            	int c=0;
            	int d=0;
            	for(int i=5;i>=1;i--)
            	{
            		if((n/i)>0)
            		{
            			c+=(n/i);
            			n-=((n/i)*i);
            		}
            	}
            	System.out.println(c);
            	}
             }
