import java.util.Scanner;
public class basic {
    // static void max(int arr[])
    // {
    //     int max = 0; 
    //     for(int i = 0 ; i < arr.length ; i++)
    //     {
    //         if(max < arr[i])
    //             max = arr[i];
    //     }
    //     System.out.println(max);
    // }

    // static void swapmix(int arr[])
    // {
    //     int min = arr[0];
    //     int max = arr[0];
    //     for(int i = 0 ; i < arr.length ; i++)
    //     {
    //         if(max < arr[i])
    //             max = arr[i];
    //         if(min > arr[i])
    //             min = arr[i];
    //     }
    //     for(int i = 0 ; i < arr.length ; i++)
    //     {
    //         if(max == arr[i])
    //             arr[i] = min;
    //         else if(min == arr[i])
    //             arr[i] = max;
    //     }
    //     for(int i = 0 ; i < arr.length ; i++)
    //     {
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // static void search(int arr[] , int ele)
    // {
    //     int i , c=0;
    //     for( i = 0 ; i < arr.length ; i++)
    //     {
    //         if(ele == arr[i])
    //         {
    //             c++;
    //             break;
    //         }
    //     }
    //     if(c>0)
    //         System.out.println(i);
    //     else
    //     System.out.println(-1);
    // }


    // static void unique(int arr[])
    // {
    //     int c=0;
    //     int i;
    //     for(i = 0 ; i < arr.length ; i++)
    //     {
    //         c=0;
    //         for(int j = 0 ; j < arr.length ; j++)
    //         {
    //             if(arr[i] == arr[j])
    //                 c++;
    //         }
    //         if(c==1)
    //         System.out.print(arr[i]);
    //     }
    // }
    
    
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int arr[] = {1,4,1,4,2,4,7,5,8,5,7,8};
        unique(arr);
    }
}
