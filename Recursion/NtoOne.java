public class NtoOne {

    static void printNtoOne(int n) {
        if (n == 0) {
            return;
        }
        printNtoOne(n - 1);
        System.out.print(n + " ");
        
    }

    public static void main(String[] args) {
        java.util.Scanner ob = new java.util.Scanner(System.in);
        int n = ob.nextInt();
        printNtoOne(n);
    }
}
