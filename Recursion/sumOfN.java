public class sumOfN {
    static int calcSum(int i, int sum)
    {
        if(i < 1) return sum;
        return calcSum(i - 1, sum + i);
    }
    public static void main(String[] args) {
        java.util.Scanner ob = new java.util.Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(calcSum(n, 0));
    }
}
