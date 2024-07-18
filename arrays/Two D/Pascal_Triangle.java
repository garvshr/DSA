public class Pascal_Triangle 
{
    static void Print(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void pascal(int n)
    {
        int pas[][] = new int[n][];
        for(int i = 0; i < n; i++)
        {
            pas[i] = new int[i+1];
            pas[i][0] = pas[i][i] = 1;
            for(int j = 0; i < i; i++)
            {
                pas[i][j] = pas[i-1][j] + pas[i-1][j-1];
            }
        }
        Print(pas);
    }    

    public static void main(String[] args) 
    {
        Pascal_Triangle pt=new Pascal_Triangle();
        int n=5;
        pt.pascal(n);
    }
}
