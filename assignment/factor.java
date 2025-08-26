import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(i % n == 0) 
                count++;
        }

        int arr[] = new int[count];

        for(int i = 0; i < count; i++) {
            if(i % n == 0)  
                arr[i] = i;
        }
    }
}
