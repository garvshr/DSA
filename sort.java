import java.util.Scanner;
class sort{
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void sorting(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left<right){
            if(arr[left] < arr[right])
                swap(arr, left ,right);
        }
        print(arr);
    }

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = ob.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = ob.nextInt();
        }
        sorting(arr);
    }
}