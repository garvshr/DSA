import java.util.*;
public class Bit_282A {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        ob.nextLine();
        int count = 0;
        for(int i = 1; i <= n; i++) {
            String operation = ob.next();
            if(operation.contains("+")) 
                count++;
            else 
                count--;
        }
        System.out.println(count);
    }
}
