import java.util.Scanner;
public class reverse {
    
    static void rev(int n)
    {
        int d , s=0 , m;
        m=n;
        if(m<0)
            m=m*(-1);
        while(m>0)
        {
            d=m%10;
            s=s*10+d;
            m=m/10;
        }
        if(n<0)
            System.out.print(s*(-1));
        else
        System.out.print(s);
    }
    public static void main(String args[])
    {
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        rev(n);
    }
}
