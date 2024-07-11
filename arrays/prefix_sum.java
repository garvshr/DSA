import java.util.Scanner;
public class prefix_sum {


    static void print(int arr[]){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void prefix(int arr[]){
        int n =arr.length;
        int pref[] = new int[n];
        pref[0] = arr[0];
        for(int i = 1; i<n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        print(pref);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = ob.nextInt();
        System.out.println("Input Array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = ob.nextInt();
        prefix(arr);
        int l = ob.nextInt();
        int r = ob.nextInt();
        int sum = pref[l]- pref[r];

    }
}
