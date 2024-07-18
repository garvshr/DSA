public class spiral_matrix 
{
    public static void main(String args[])
    {
        int mat[][] = {{1,2,3},{4,5,6},{7,8,10}};
        int r = mat.length, c = mat[0].length;
        int topRow=0, bottomRow=r-1, leftCol=0, rightCol=c-1;
        int totalEle=0;

        while(totalEle < r*c)
        {
            for(int i = leftCol; i <= rightCol && totalEle < r*c ; i++)
            {
                System.out.print(mat[topRow][i]);
                totalEle++;
            }
            topRow++;

            for(int i = topRow; i <= bottomRow && totalEle < r*c ; i++)
            {
                System.out.print(mat[i][rightCol]);
                totalEle++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol && totalEle < r*c ; i--)
            {
                System.out.print(mat[bottomRow][i]);
                totalEle++;
            }
            bottomRow--;

            for(int i = bottomRow; i >= topRow && totalEle < r*c ; i--)
            {
                System.out.print(mat[i][leftCol]);
                totalEle++;
            }
            leftCol--;
        }
    }
}
