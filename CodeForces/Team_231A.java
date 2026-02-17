
import java.util.Scanner;


public class Team_231A {
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) 
        {
            int Petya = ob.nextInt();
            int Vasya = ob.nextInt();
            int Tonya = ob.nextInt();

            if( (Petya + Vasya + Tonya) >= 2)
                count++;
        }
        System.out.println(count);
    }
}
