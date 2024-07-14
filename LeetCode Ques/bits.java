import java.util.Scanner;
class decimal
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int dec , d=0;
        int arr[]=new int[100];
        dec=ob.nextInt();

        while(dec != 0)
        {
            arr[d] = dec%2;
            dec/=2;
            d++;
        }

        int c=0;

        for(int i=0; i<=d; i++)
        {
            if(arr[i]==1)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}
