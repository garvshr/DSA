import java.util.Scanner;
class any_base {
    static void convert(int n , int base)
    {
        char digits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int d;
        StringBuilder st=new StringBuilder();
        if(base < 2 || base>16)
            return;
        while(n!=0)
        {
            d=n % base;
            st.append(digits[d]);
            n = n / base;
        }
        System.out.println(st.reverse());
    }
    public static void main(String args[])
    {
        int n , base;
        Scanner garv=new Scanner(System.in);
        System.out.println("Enter Number and the base");
        n = garv.nextInt();
        base = garv.nextInt();
        convert(n,base);
    }
}
