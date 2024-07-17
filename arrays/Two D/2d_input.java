import java.util.*;
class two_d_input 
{
    public static void main(String[] args) 
    {
        Scanner ob= new Scanner(System.in);
        int arr[][] = new int[3][3];  
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = ob.nextInt();
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j] + " ");;
            }
            System.out.println();
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[j][i] + " ");;
            }
            System.out.println();
        }
    }    
}
