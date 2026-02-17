import java.util.Arrays;

class FractionalKnapsack 
{
    static double fractionalKnapsack(int[] val, int[] wt, int capacity)
    {
        int[][] items = new int[val.length][2];
        for(int i = 0; i < val.length; i++)
        {
            items[i][0] = val[i];
            items[i][1] = wt[i];
        }

        Arrays.sort(items, (a, b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));
        double res = 0.0;
        int currentCapacity = capacity;
        for(int i = 0; i < items.length; i++)
        {
            if (items[i][1] <= currentCapacity) 
            {
                res += items[i][0];
                currentCapacity -= items[i][1];
            }
            else 
            {
                res += (1.0 * items[i][0] / items[i][1]) * currentCapacity;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args)
    {
        int[] val = {30, 20, 100, 90, 160};
        int[] wt = {5, 10, 30, 20, 40};
        int capacity = 60;

        System.out.println(fractionalKnapsack(val, wt, capacity));
    }   
}