import java.util.Scanner;
public class reverse {
    
    static int rev(int n)
    {
        int rev=0;
        while(n !=0 )
        {
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
            int d = n % 10;
            n /= 10;
            rev = (rev*10) + d;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        rev(n);
    }
}
