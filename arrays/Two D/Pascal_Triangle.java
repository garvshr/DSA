import java.util.ArrayList;
import java.util.List;
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

    // static void pascal(int n)
    // {
    //     int pas[][] = new int[n][];
    //     for(int i = 0; i < n; i++)
    //     {
    //         pas[i] = new int[i+1];
    //         pas[i][0] = pas[i][i] = 1;
    //         for(int j = 1; j < i; j++)
    //         {
    //             pas[i][j] = pas[i-1][j] + pas[i-1][j-1];
    //         }
    //     }
    //     Print(pas);
    // }    

    static List<List<Integer>> pascal(int n)
    {
        List<List<Integer>> pas = new ArrayList<>();
        for(int i = 0; i <= n; i++)
        {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) 
            {
                if(j == 0 || j == i)
                    row.add(1); 
                else
                    row.add((pas.get(i-1).get(j)) + pas.get(i-1).get(j-1));  
            }
            pas.add(row); 
        }
        return pas;
    }

    public static void main(String[] args) 
    {
        Pascal_Triangle pt=new Pascal_Triangle();
        int n=5;
        pt.pascal(n);
    }
}
