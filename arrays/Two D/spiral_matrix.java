import java.util.*;
public class spiral_matrix 
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Size of the matrix");
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

        int leftCol=0, topRow=0, rightCol=c-1, bottomRow=r-1;
        int totalEle = 0;
        
        while(totalEle < r*c)
        {
            for(int i = leftCol; i <= rightCol && totalEle < r*c; i++)
            {
                System.out.print(mat[topRow][i] + " ");
                totalEle++;
            }
            topRow++;

            for(int i = topRow; i <= bottomRow && totalEle < r*c; i++)
            {
                System.out.print(mat[i][rightCol] + " ");
                totalEle++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol && totalEle < r*c; i--)
            {
                System.out.print(mat[bottomRow][i] + " ");
                totalEle++;
            }
            bottomRow--;

            for(int i = bottomRow; i >= topRow && totalEle < r*c; i--)
            {
                System.out.print(mat[i][leftCol] + " ");
                totalEle++;
            }
            leftCol++;
        }
    }
}
