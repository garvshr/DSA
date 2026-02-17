import java.util.Scanner;
public class Watermelon_4A 
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int weight = ob.nextInt();
        if(weight > 2 && weight % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}


//4A