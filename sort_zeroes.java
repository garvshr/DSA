import java.util.Scanner;
public class sort_zeroes 
{
    static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static void swap(int arr[] , int i , int j)
    {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void zeroes_sort(int arr[])
    {
        int n = arr.length;
        int left=0 , right =n-1;
        while(left < right)
        {
            if(arr[left] == 1 && arr[right] == 0 )
            {
                swap(arr , left , right);
                left++;
                right--;
            }
            if(arr[left]==0)
                left++;
            if(arr[right]==1)
                right--;
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
        zeroes_sort(arr);
    }
}
