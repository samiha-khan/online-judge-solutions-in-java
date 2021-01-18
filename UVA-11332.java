import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;  ;i++)
        {
            int num=sc.nextInt();
            if(num==0)
            {
                break;
            }
            else if(0<num&&num<10)
            {
                System.out.println(num);
            }
            else
            {
               while(num>9)
               {
                  int r=0;
                  int sum=0;
                  for(int store=num;store>0;store/=10)
                  {
                      r=store%10;
                      sum+=r;
                  }
                  num=sum;
               }
               System.out.println(num);
            }
        } 
    }
}
