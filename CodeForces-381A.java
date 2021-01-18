import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [n];
        int s1=0,s2=0;
        int store,i=0,l=n-1;
        for(int x=0;x<n;x++)
        {
            a[x]=sc.nextInt();
        }
        for(int c=0;c<n;c++)
        {
            if(c%2==0){
                if(a[i]>a[l]){
                    s1+=a[i];
                    i++;
                }
                else{
                    s1+=a[l];
                    l--;
                }
            }
            else{
                if(a[i]>a[l]){
                    s2+=a[i];
                    i++;
                }
                else{
                    s2+=a[l];
                    l--;
                }
            }
        }
        System.out.println(s1+" "+s2);
    }
}
