import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(); //set no
        sc.nextLine();
        for(int i=1;i<=t;i++)
        {
            String e=sc.nextLine();
            String l=sc.nextLine(); 
            String []f=e.split("\\."); 
            String []m=l.split("\\."); 
            int []g=new int[4]; 
            int []n=new int[4];
            int []p=new int[4];
            String []z=new String[4];
            int c=0;
            for(int j=0;j<g.length;j++)
            {
                g[j]=Integer.parseInt(f[j]);
                n[j]=Integer.parseInt(m[j]);
                z[j]=Integer.toBinaryString(g[j]);
                p[j]=Integer.parseInt(z[j]);
                if(n[j]==p[j])
                {
                    c++;
                }
            }
            if(c==4)
            {
                System.out.println("Case "+i+": Yes");
            }
            else
            {
                System.out.println("Case "+i+": No");
            }
        }
    }
}
