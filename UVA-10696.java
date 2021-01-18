import java.util.Scanner;
        public class Main
        {
        	public static void main(String []args)
        	{
        		Scanner sc=new Scanner(System.in);
        		for(int i=1;   ;i++)
        		{
        			int n=sc.nextInt();
        			if(n==0)
        			{
        				break;
        			}
        			else if(n<=100)
        			{
        				System.out.println("f91("+n+") = 91");
        			}
        			else if(n>=101)
        			{
        				System.out.println("f91("+n+") = "+(n-10));
        			}
        		}
        	}
        }
