import java.util.*;
public class prefix_sum_mat
{
    static void prefSum(int mat[][])
    {
        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) 
        {
            for (int j = 1; j < c; j++) 
            {
                mat[i][j] += mat[i][j-1];
            }    
        }
    }
    void arraySum(int mat[][],int l1, int r1, int l2, int r2)
    {
        int sum = 0;
        prefSum(mat);
        for (int i = l1; i < l2; i++) 
        {
            if(r1 >= 1)
                sum += mat[i][r2] - mat[i][r1-1];
            else
                sum += mat[i][r2];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Rows and Column");
        int r = ob.nextInt();
        int c = ob.nextInt();

        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                mat[i][j] = ob.nextInt();
            }    
        }

        System.out.println("Enter l1 and r1");
        int l1 = ob.nextInt();
        int r1 = ob.nextInt();

        System.out.println("Enter l2 and r2");
        int l2 = ob.nextInt();
        int r2 = ob.nextInt();

        prefix_sum_mat ps=new prefix_sum_mat();
        ps.arraySum(mat, l1, r1 , l2, r2);
    }    
}
