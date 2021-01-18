        import java.util.Scanner;
        public class Main
        {
         public static void main(String []args)
         {
          Scanner sc=new Scanner(System.in);
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int []s={a+b+c,a*b*c,a*b+c,a+b*c,(a+b)*c,a*(b+c),a+b+c,a*b*c,a*b+c,a+b*c,(a+b)*c,a*(b+c)};
          int max=s[0];
          for(int i=1;i<s.length;i++)
          {
           if(max<s[i])
           {
            max=s[i];
           }
          }
          System.out.println(max);
         }
        }

