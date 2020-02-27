import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        for(int i=1;i<=t+1;i++){
            String s=sc.nextLine();
            if(s.equals("Tetrahedron")){
                sum+=4;
            }
            else if(s.equals("Cube")){
                sum+=6;
            }
            else if(s.equals("Octahedron")){
                sum+=8;
            }
            else if(s.equals("Dodecahedron")){
                sum+=12;
            }
            else if(s.equals("Icosahedron")){
                sum+=20;
            }
        }
        System.out.println(sum);
    }
}
