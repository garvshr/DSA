public class palindrome {
    public static void main(String agrs[])
    {
        int n=-121, s=0, d, m;
        m=n;
        while(n != 0)
        {
            d=n%10;
            n=n/10;
            s=s*10 + d;
        }
        if(m==s)
            System.out.println("Yes");
        else
            System.out.println("No");
    }  
}
