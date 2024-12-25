
// class heh
// {
//     public static void main(String args[])
//     {
//         Scanner ob = new Scanner(System.in);
//         System.out.println("Enter a decimal");
//         int n = ob.nextInt();
//         int arr[] = new int[20];
//         int k = 0;
//         while(n > 0)
//         {
//             arr[k++] = n % 2;
//             n = n / 2;
//         }
//         for(int i = k-1; i >= 0; i--)
//             System.out.print(arr[i]);
//     }
// }


// import java.util.*;
// class heh
// {
//     public static void main(String args[])
//     {
        
//         byte B = 1208;	
//         try (Scanner ob = new Scanner(System.in)) {
//             System.out.println("Enter a Binary");
//             int n = ob.nextInt();
//             int k = 0;
//             int sum = 0;
//             while(n > 0)
//             {
//                 int d = n % 10;
//                 sum += d * Math.pow(2,k++);
//                 n = n / 10;
//             }
//             System.out.println(sum);
//         }
//     }
// }

import java.util.Scanner;
public class heh
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String st = ob.nextLine();
        int left = 0;
        int right = st.length() - 1;
        boolean flag = true;

        while(left <= right)
        {
            if(st.charAt(left) == st.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.print("Palindrome");
        else
            System.out.print("Not a Palindrome");
    }
}