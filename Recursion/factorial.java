class factorial
{
    static int fact(int n)
    {
        if(n == 1) return 1;
        return n * fact(n - 1);
    }
    public static void main(String[] args) 
    {
        java.util.Scanner ob = new java.util.Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(fact(n));
    }
}