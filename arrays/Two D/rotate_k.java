import java.util.*;
public class rotate_k 
{
    static void Print(int arr[][])
    {
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Transpose(int arr[][])
    {
        for(int i=0; i<3; i++)
        {
            for(int j=i; j<3; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    static void Reverse(int arr[])
    {
        int left=0, right=arr.length;
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void Rotate(int arr[][],int k)
    {
        for(int i=0; i < k; i++)
        {
            Transpose(arr);
            for(int j=0; j < arr.length; j++)
            {
                Reverse(arr[j]);
            }
            Print(arr);
        }
    }
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][3];
        Scanner ob= new Scanner(System.in);
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }
        Rotate(arr, 6);    
    }
}