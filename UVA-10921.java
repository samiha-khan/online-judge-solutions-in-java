    import java.util.Scanner;
    public class Main
    {
        public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            String n;
            while(sc.hasNextLine())
            {
                n=sc.nextLine();
                for(int i=0;i<n.length();i++)
                {
                    if(n.charAt(i)=='1'||n.charAt(i)=='0'||n.charAt(i)=='-')
                    {
                        System.out.print(n.charAt(i));
                    }
                    else if(n.charAt(i)=='A'||n.charAt(i)=='B'||n.charAt(i)=='C')
                    {
                        System.out.print(2);
                    }
                    else if(n.charAt(i)=='D'||n.charAt(i)=='E'||n.charAt(i)=='F')
                    {
                        System.out.print(3);
                    }
                    else if(n.charAt(i)=='G'||n.charAt(i)=='H'||n.charAt(i)=='I')
                    {
                        System.out.print(4);
                    }
                    else if(n.charAt(i)=='J'||n.charAt(i)=='K'||n.charAt(i)=='L')
                    {
                        System.out.print(5);
                    }
                    else if(n.charAt(i)=='M'||n.charAt(i)=='N'||n.charAt(i)=='O')
                    {
                        System.out.print(6);
                    }
                    else if(n.charAt(i)=='P'||n.charAt(i)=='Q'||n.charAt(i)=='R'||n.charAt(i)=='S')
                    {
                        System.out.print(7);
                    }
                    else if(n.charAt(i)=='T'||n.charAt(i)=='U'||n.charAt(i)=='V')
                    {
                        System.out.print(8);
                    }
                    else if(n.charAt(i)=='W'||n.charAt(i)=='X'||n.charAt(i)=='Y'||n.charAt(i)=='Z')
                    {
                        System.out.print(9);
                    }
                }
                System.out.println();
            }
        }
    }

