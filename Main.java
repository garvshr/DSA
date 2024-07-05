class Solution 
{
    static boolean uniqueOccurrences(int[] arr) 
    {
        int[] store = new int[arr.length];
        int i, j, c;

        // Count occurrences of each element
        for (i = 0; i < arr.length; i++) 
        {
            c = 0;
            for (j = 0; j < arr.length; j++) 
            {
                if (arr[i] == arr[j])
                    c++;
            }
            store[i] = c;
        }
        int count=1;
        // Check if all occurrence counts are unique
        for (i = 0; i < store.length -1 ; i++) 
        {
            if(store[i] != store[i+1])
                count=0;
        }
        if(count==1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) 
    {
        Solution solution = new Solution();

        int[] test1 = {1, 2, 2, 1, 1, 3};
        int[] test2 = {1, 2};
        int[] test3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println(solution.uniqueOccurrences(test1)); // should return true
        System.out.println(solution.uniqueOccurrences(test2)); // should return false
        System.out.println(solution.uniqueOccurrences(test3)); // should return true
    }
}
