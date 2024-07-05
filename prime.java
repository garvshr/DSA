import java.util.*;
public class prime {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int n;
        int c = 0 ;
        n = ob.nextInt();
        for(int i = 3 ; i <= n/2 ; i++)
        {
            if(n % i == 0)
                c=1;
            break;
        }
        if(c==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
