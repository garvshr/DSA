public class reverseOrder 
{
    static void reverse(int n) 
    {
        if (n == 0) 
        {
            return;
        }
        reverse(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) 
    {
        java.util.Scanner ob = new java.util.Scanner(System.in);
        int n = ob.nextInt();
        reverse(n);
    }
}
