import java.util.*;
class sort 
{
    static void sortArray(int[] nums) 
    {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i : nums)
        {
            hash.put(i,hash.getOrDefault(i,0) + 1);
        }
        System.out.println(hash);
    }
    public static void main(String[] args) 
    {
    sort ac = new sort();
    int[] test1 = {1, 2, 2, 1, 1, 3};
    int[] test2 = {1, 2};
    int[] test3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
    ac.sortArray(test1);
    ac.sortArray(test2); 
    ac.sortArray(test3);
    }
}
