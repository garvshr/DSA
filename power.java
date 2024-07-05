import java.util.Scanner;
class power {
    static void powerr(int n)
    {
        int c=0,d;
        while(n!=1)
        {
            d=n%2;
            if(d==1)
            {
                c=1;
                break;
            }
            n=n/2;
        }
        if(c==0 && n==1)
            System.out.println("True");
        else
            System.out.println("False");
        
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int nn;
        nn=ob.nextInt();
        powerr(nn);
    }
}
